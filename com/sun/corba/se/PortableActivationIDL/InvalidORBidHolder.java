package com.sun.corba.se.PortableActivationIDL;

/**
* com/sun/corba/se/PortableActivationIDL/InvalidORBidHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/re/workspace/8-2-build-windows-amd64-cygwin/jdk8u162/10278/corba/src/share/classes/com/sun/corba/se/PortableActivationIDL/activation.idl
* Tuesday, December 19, 2017 8:01:30 PM PST
*/

public final class InvalidORBidHolder implements org.omg.CORBA.portable.Streamable
{
  public com.sun.corba.se.PortableActivationIDL.InvalidORBid value = null;

  public InvalidORBidHolder ()
  {
  }

  public InvalidORBidHolder (com.sun.corba.se.PortableActivationIDL.InvalidORBid initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = com.sun.corba.se.PortableActivationIDL.InvalidORBidHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    com.sun.corba.se.PortableActivationIDL.InvalidORBidHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return com.sun.corba.se.PortableActivationIDL.InvalidORBidHelper.type ();
  }

}
