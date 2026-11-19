package org.eclipse.paho.client.mqttv3.internal.wire;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttPersistable;
import org.eclipse.paho.client.mqttv3.MqttToken;
import org.eclipse.paho.client.mqttv3.internal.ExceptionHelper;

/* loaded from: classes6.dex */
public abstract class MqttWireMessage {
    private static final long FOUR_BYTE_INT_MAX = 4294967295L;
    public static final byte MESSAGE_TYPE_CONNACK = 2;
    public static final byte MESSAGE_TYPE_CONNECT = 1;
    public static final byte MESSAGE_TYPE_DISCONNECT = 14;
    public static final byte MESSAGE_TYPE_PINGREQ = 12;
    public static final byte MESSAGE_TYPE_PINGRESP = 13;
    public static final byte MESSAGE_TYPE_PUBACK = 4;
    public static final byte MESSAGE_TYPE_PUBCOMP = 7;
    public static final byte MESSAGE_TYPE_PUBLISH = 3;
    public static final byte MESSAGE_TYPE_PUBREC = 5;
    public static final byte MESSAGE_TYPE_PUBREL = 6;
    public static final byte MESSAGE_TYPE_SUBACK = 9;
    public static final byte MESSAGE_TYPE_SUBSCRIBE = 8;
    public static final byte MESSAGE_TYPE_UNSUBACK = 11;
    public static final byte MESSAGE_TYPE_UNSUBSCRIBE = 10;
    private static final int VARIABLE_BYTE_INT_MAX = 268435455;
    protected boolean duplicate = false;
    protected int msgId = 0;
    private MqttToken token;
    private byte type;
    protected static final Charset STRING_ENCODING = StandardCharsets.UTF_8;
    private static final String[] PACKET_NAMES = {"reserved", "CONNECT", "CONNACK", "PUBLISH", "PUBACK", "PUBREC", "PUBREL", "PUBCOMP", "SUBSCRIBE", "SUBACK", "UNSUBSCRIBE", "UNSUBACK", "PINGREQ", "PINGRESP", "DISCONNECT"};

    public MqttWireMessage(byte b10) {
        this.type = b10;
    }

    public static MqttWireMessage createWireMessage(MqttPersistable mqttPersistable) {
        byte[] payloadBytes = mqttPersistable.getPayloadBytes();
        if (payloadBytes == null) {
            payloadBytes = new byte[0];
        }
        return createWireMessage(new MultiByteArrayInputStream(mqttPersistable.getHeaderBytes(), mqttPersistable.getHeaderOffset(), mqttPersistable.getHeaderLength(), payloadBytes, mqttPersistable.getPayloadOffset(), mqttPersistable.getPayloadLength()));
    }

    public static String decodeUTF8(DataInputStream dataInputStream) throws MqttException, IOException {
        try {
            byte[] bArr = new byte[dataInputStream.readUnsignedShort()];
            dataInputStream.readFully(bArr);
            String str = new String(bArr, STRING_ENCODING);
            validateUTF8String(str);
            return str;
        } catch (IOException e10) {
            throw new MqttException(e10);
        }
    }

    public static byte[] encodeMBI(long j10) {
        validateVariableByteInt((int) j10);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i10 = 0;
        do {
            byte b10 = (byte) (j10 % 128);
            j10 /= 128;
            if (j10 > 0) {
                b10 = (byte) (b10 | 128);
            }
            byteArrayOutputStream.write(b10);
            i10++;
            if (j10 <= 0) {
                break;
            }
        } while (i10 < 4);
        return byteArrayOutputStream.toByteArray();
    }

    public static void encodeUTF8(DataOutputStream dataOutputStream, String str) throws MqttException, IOException {
        validateUTF8String(str);
        try {
            byte[] bytes = str.getBytes(STRING_ENCODING);
            byte length = (byte) ((bytes.length >>> 8) & 255);
            byte length2 = (byte) (bytes.length & 255);
            dataOutputStream.write(length);
            dataOutputStream.write(length2);
            dataOutputStream.write(bytes);
        } catch (UnsupportedEncodingException e10) {
            throw new MqttException(e10);
        } catch (IOException e11) {
            throw new MqttException(e11);
        }
    }

    public static MultiByteInteger readMBI(DataInputStream dataInputStream) throws IOException {
        byte b10;
        int i10 = 0;
        int i11 = 0;
        int i12 = 1;
        do {
            b10 = dataInputStream.readByte();
            i10++;
            i11 += (b10 & 127) * i12;
            i12 *= 128;
        } while ((b10 & 128) != 0);
        if (i11 >= 0 && i11 <= VARIABLE_BYTE_INT_MAX) {
            return new MultiByteInteger(i11, i10);
        }
        throw new IOException("This property must be a number between 0 and 268435455. Read value was: " + i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003c A[PHI: r1
      0x003c: PHI (r1v2 int) = (r1v1 int), (r1v1 int), (r1v7 int) binds: [B:25:0x004e, B:29:0x0057, B:16:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void validateUTF8String(java.lang.String r7) {
        /*
            r0 = 0
            r1 = r0
        L2:
            int r2 = r7.length()
            if (r1 < r2) goto L9
            return
        L9:
            char r2 = r7.charAt(r1)
            boolean r3 = java.lang.Character.isHighSurrogate(r2)
            r4 = 65534(0xfffe, float:9.1833E-41)
            r5 = 1
            if (r3 == 0) goto L3e
            int r1 = r1 + 1
            int r3 = r7.length()
            if (r1 != r3) goto L21
        L1f:
            r3 = r5
            goto L5a
        L21:
            char r3 = r7.charAt(r1)
            boolean r6 = java.lang.Character.isLowSurrogate(r3)
            if (r6 == 0) goto L2c
            goto L1f
        L2c:
            r6 = r2 & 1023(0x3ff, float:1.434E-42)
            int r6 = r6 << 10
            r3 = r3 & 1023(0x3ff, float:1.434E-42)
            r3 = r3 | r6
            r6 = 65535(0xffff, float:9.1834E-41)
            r3 = r3 & r6
            if (r3 == r6) goto L1f
            if (r3 != r4) goto L3c
            goto L1f
        L3c:
            r3 = r0
            goto L5a
        L3e:
            boolean r3 = java.lang.Character.isISOControl(r2)
            if (r3 != 0) goto L1f
            boolean r3 = java.lang.Character.isLowSurrogate(r2)
            if (r3 == 0) goto L4b
            goto L1f
        L4b:
            r3 = 64976(0xfdd0, float:9.1051E-41)
            if (r2 < r3) goto L3c
            if (r2 == r4) goto L1f
            if (r2 >= r3) goto L1f
            r3 = 64991(0xfddf, float:9.1072E-41)
            if (r2 > r3) goto L3c
            goto L1f
        L5a:
            if (r3 != 0) goto L5e
            int r1 = r1 + r5
            goto L2
        L5e:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "Invalid UTF-8 char: [%x]"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: org.eclipse.paho.client.mqttv3.internal.wire.MqttWireMessage.validateUTF8String(java.lang.String):void");
    }

    public static void validateVariableByteInt(int i10) {
        if (i10 < 0 || i10 > VARIABLE_BYTE_INT_MAX) {
            throw new IllegalArgumentException("This property must be a number between 0 and 268435455");
        }
    }

    public byte[] encodeMessageId() throws MqttException, IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeShort(this.msgId);
            dataOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e10) {
            throw new MqttException(e10);
        }
    }

    public byte[] getHeader() throws MqttException, IOException {
        try {
            int type = ((getType() & 15) << 4) ^ (getMessageInfo() & 15);
            byte[] variableHeader = getVariableHeader();
            int length = variableHeader.length + getPayload().length;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(type);
            dataOutputStream.write(encodeMBI(length));
            dataOutputStream.write(variableHeader);
            dataOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e10) {
            throw new MqttException(e10);
        }
    }

    public String getKey() {
        return Integer.toString(getMessageId());
    }

    public int getMessageId() {
        return this.msgId;
    }

    public abstract byte getMessageInfo();

    public byte[] getPayload() {
        return new byte[0];
    }

    public MqttToken getToken() {
        return this.token;
    }

    public byte getType() {
        return this.type;
    }

    public abstract byte[] getVariableHeader();

    public boolean isMessageIdRequired() {
        return true;
    }

    public boolean isRetryable() {
        return false;
    }

    public void setDuplicate(boolean z10) {
        this.duplicate = z10;
    }

    public void setMessageId(int i10) {
        this.msgId = i10;
    }

    public void setToken(MqttToken mqttToken) {
        this.token = mqttToken;
    }

    public String toString() {
        return PACKET_NAMES[this.type];
    }

    public static MqttWireMessage createWireMessage(byte[] bArr) {
        return createWireMessage(new ByteArrayInputStream(bArr));
    }

    private static MqttWireMessage createWireMessage(InputStream inputStream) throws MqttException, IOException {
        try {
            DataInputStream dataInputStream = new DataInputStream(new CountingInputStream(inputStream));
            int unsignedByte = dataInputStream.readUnsignedByte();
            byte b10 = (byte) (unsignedByte >> 4);
            byte b11 = (byte) (unsignedByte & 15);
            long counter = (r0.getCounter() + readMBI(dataInputStream).getValue()) - r0.getCounter();
            byte[] bArr = new byte[0];
            if (counter > 0) {
                int i10 = (int) counter;
                byte[] bArr2 = new byte[i10];
                dataInputStream.readFully(bArr2, 0, i10);
                bArr = bArr2;
            }
            if (b10 == 1) {
                return new MqttConnect(b11, bArr);
            }
            if (b10 == 3) {
                return new MqttPublish(b11, bArr);
            }
            if (b10 == 4) {
                return new MqttPubAck(b11, bArr);
            }
            if (b10 == 7) {
                return new MqttPubComp(b11, bArr);
            }
            if (b10 == 2) {
                return new MqttConnack(b11, bArr);
            }
            if (b10 == 12) {
                return new MqttPingReq(b11, bArr);
            }
            if (b10 == 13) {
                return new MqttPingResp(b11, bArr);
            }
            if (b10 == 8) {
                return new MqttSubscribe(b11, bArr);
            }
            if (b10 == 9) {
                return new MqttSuback(b11, bArr);
            }
            if (b10 == 10) {
                return new MqttUnsubscribe(b11, bArr);
            }
            if (b10 == 11) {
                return new MqttUnsubAck(b11, bArr);
            }
            if (b10 == 6) {
                return new MqttPubRel(b11, bArr);
            }
            if (b10 == 5) {
                return new MqttPubRec(b11, bArr);
            }
            if (b10 == 14) {
                return new MqttDisconnect(b11, bArr);
            }
            throw ExceptionHelper.createMqttException(6);
        } catch (IOException e10) {
            throw new MqttException(e10);
        }
    }
}
