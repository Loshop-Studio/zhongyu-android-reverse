package org.eclipse.paho.client.mqttv3.internal;

import java.util.ArrayList;
import org.eclipse.paho.client.mqttv3.BufferedMessage;
import org.eclipse.paho.client.mqttv3.DisconnectedBufferOptions;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttToken;
import org.eclipse.paho.client.mqttv3.internal.wire.MqttWireMessage;
import org.eclipse.paho.client.mqttv3.logging.Logger;
import org.eclipse.paho.client.mqttv3.logging.LoggerFactory;

/* loaded from: classes6.dex */
public class DisconnectedMessageBuffer implements Runnable {
    private final String CLASS_NAME;
    private final Object bufLock;
    private ArrayList<BufferedMessage> buffer;
    private DisconnectedBufferOptions bufferOpts;
    private IDisconnectedBufferCallback callback;
    private Logger log;
    private IDiscardedBufferMessageCallback messageDiscardedCallBack;
    private int mycount;

    public DisconnectedMessageBuffer(DisconnectedBufferOptions disconnectedBufferOptions) {
        String name = DisconnectedMessageBuffer.class.getName();
        this.CLASS_NAME = name;
        this.log = LoggerFactory.getLogger(LoggerFactory.MQTT_CLIENT_MSG_CAT, name);
        this.bufLock = new Object();
        this.mycount = 0;
        this.bufferOpts = disconnectedBufferOptions;
        this.buffer = new ArrayList<>();
    }

    public void deleteMessage(int i10) {
        synchronized (this.bufLock) {
            this.buffer.remove(i10);
        }
    }

    public BufferedMessage getMessage(int i10) {
        BufferedMessage bufferedMessage;
        synchronized (this.bufLock) {
            bufferedMessage = this.buffer.get(i10);
        }
        return bufferedMessage;
    }

    public int getMessageCount() {
        int size;
        synchronized (this.bufLock) {
            size = this.buffer.size();
        }
        return size;
    }

    public boolean isPersistBuffer() {
        return this.bufferOpts.isPersistBuffer();
    }

    public void putMessage(MqttWireMessage mqttWireMessage, MqttToken mqttToken) {
        if (mqttToken != null) {
            mqttWireMessage.setToken(mqttToken);
            mqttToken.internalTok.setMessageID(mqttWireMessage.getMessageId());
        }
        BufferedMessage bufferedMessage = new BufferedMessage(mqttWireMessage, mqttToken);
        synchronized (this.bufLock) {
            try {
                if (this.buffer.size() < this.bufferOpts.getBufferSize()) {
                    this.buffer.add(bufferedMessage);
                } else {
                    if (!this.bufferOpts.isDeleteOldestMessages()) {
                        throw new MqttException(32203);
                    }
                    if (this.messageDiscardedCallBack != null) {
                        this.messageDiscardedCallBack.messageDiscarded(this.buffer.get(0).getMessage());
                    }
                    this.buffer.remove(0);
                    this.buffer.add(bufferedMessage);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() throws InterruptedException {
        this.log.fine(this.CLASS_NAME, "run", "516");
        while (getMessageCount() > 0) {
            try {
                this.callback.publishBufferedMessage(getMessage(0));
                deleteMessage(0);
            } catch (MqttException e10) {
                if (e10.getReasonCode() != 32202) {
                    this.log.severe(this.CLASS_NAME, "run", "519", new Object[]{Integer.valueOf(e10.getReasonCode()), e10.getMessage()});
                    return;
                }
                try {
                    Thread.sleep(100L);
                } catch (Exception unused) {
                }
            }
        }
    }

    public void setMessageDiscardedCallBack(IDiscardedBufferMessageCallback iDiscardedBufferMessageCallback) {
        this.messageDiscardedCallBack = iDiscardedBufferMessageCallback;
    }

    public void setPublishCallback(IDisconnectedBufferCallback iDisconnectedBufferCallback) {
        this.callback = iDisconnectedBufferCallback;
    }
}
