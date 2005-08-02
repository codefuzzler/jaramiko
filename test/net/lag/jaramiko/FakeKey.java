/*
 * Copyright (C) 2005 Robey Pointer <robey@lag.net>
 *
 * This file is part of paramiko.
 *
 * Permission is hereby granted, free of charge, to any person obtaining
 * a copy of this software and associated documentation files (the
 * "Software"), to deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish,
 * distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so, subject to
 * the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included
 * in all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS
 * OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.
 * IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY
 * CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT,
 * TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE
 * SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 * 
 * 
 * Created on May 23, 2005
 */

package net.lag.jaramiko;

import java.math.BigInteger;
import java.security.SecureRandom;

/**
 * @author robey
 */
public class FakeKey
    extends PKey
{
    public Message
    signSSHData (SecureRandom random, byte[] data)
    {
        Message m = new Message();
        m.putBytes("fake-sig".getBytes());
        return m;
    }
    
    public boolean
    verifySSHSignature (byte[] data, Message sig)
    {
        return false;
    }
    
    protected void
    buildFromBER (BigInteger[] ints)
    {
        // pass
    }
    
    protected void
    buildFromMessage (Message m)
    {
        // pass
    }
    
    public byte[]
    toByteArray ()
    {
        return "fake-key".getBytes();
    }
    
    public boolean
    canSign ()
    {
        return true;
    }
    
    public int
    getBits ()
    {
        return 0;
    }
    
    public String
    getSSHName ()
    {
        return "none";
    }
}
