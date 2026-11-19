package org.eclipse.paho.client.mqttv3.internal.wire;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.net.SocketTimeoutException;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.internal.ClientState;
import org.eclipse.paho.client.mqttv3.internal.ExceptionHelper;
import org.eclipse.paho.client.mqttv3.logging.Logger;
import org.eclipse.paho.client.mqttv3.logging.LoggerFactory;

/* loaded from: classes6.dex */
public class MqttInputStream extends InputStream {
    private final String CLASS_NAME;
    private ByteArrayOutputStream bais;
    private ClientState clientState;

    /* renamed from: in */
    private DataInputStream f25511in;
    private final Logger log;
    private byte[] packet;
    private int packetLen;
    private int remLen;

    public MqttInputStream(ClientState clientState, InputStream inputStream) {
        String name = MqttInputStream.class.getName();
        this.CLASS_NAME = name;
        this.log = LoggerFactory.getLogger(LoggerFactory.MQTT_CLIENT_MSG_CAT, name);
        this.clientState = clientState;
        this.f25511in = new DataInputStream(inputStream);
        this.bais = new ByteArrayOutputStream();
        this.remLen = -1;
    }

    private void readFully() throws IOException {
        int size = this.bais.size();
        int i10 = this.packetLen;
        int i11 = size + i10;
        int i12 = this.remLen - i10;
        if (i12 < 0) {
            throw new IndexOutOfBoundsException();
        }
        int i13 = 0;
        while (i13 < i12) {
            try {
                int i14 = this.f25511in.read(this.packet, i11 + i13, i12 - i13);
                if (i14 < 0) {
                    throw new EOFException();
                }
                this.clientState.notifyReceivedBytes(i14);
                i13 += i14;
            } catch (SocketTimeoutException e10) {
                this.packetLen += i13;
                throw e10;
            }
        }
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f25511in.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f25511in.close();
    }

    @Override // java.io.InputStream
    public int read() {
        return this.f25511in.read();
    }

    public MqttWireMessage readMqttWireMessage() throws MqttException, IOException {
        try {
            if (this.remLen < 0) {
                this.bais.reset();
                byte b10 = this.f25511in.readByte();
                this.clientState.notifyReceivedBytes(1);
                byte b11 = (byte) ((b10 >>> 4) & 15);
                if (b11 < 1 || b11 > 14) {
                    throw ExceptionHelper.createMqttException(32108);
                }
                this.remLen = MqttWireMessage.readMBI(this.f25511in).getValue();
                this.bais.write(b10);
                this.bais.write(MqttWireMessage.encodeMBI(this.remLen));
                this.packet = new byte[this.bais.size() + this.remLen];
                this.packetLen = 0;
            }
            if (this.remLen < 0) {
                return null;
            }
            readFully();
            this.remLen = -1;
            byte[] byteArray = this.bais.toByteArray();
            System.arraycopy(byteArray, 0, this.packet, 0, byteArray.length);
            MqttWireMessage mqttWireMessageCreateWireMessage = MqttWireMessage.createWireMessage(this.packet);
            this.log.fine(this.CLASS_NAME, "readMqttWireMessage", "301", new Object[]{mqttWireMessageCreateWireMessage});
            return mqttWireMessageCreateWireMessage;
        } catch (SocketTimeoutException unused) {
            return null;
        }
    }
}
