package org.eclipse.paho.client.mqttv3.internal;

import java.io.InputStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import org.eclipse.paho.client.mqttv3.internal.wire.MqttInputStream;
import org.eclipse.paho.client.mqttv3.logging.Logger;
import org.eclipse.paho.client.mqttv3.logging.LoggerFactory;

/* loaded from: classes6.dex */
public class CommsReceiver implements Runnable {
    private static final String CLASS_NAME = "org.eclipse.paho.client.mqttv3.internal.CommsReceiver";
    private ClientComms clientComms;
    private ClientState clientState;
    private State current_state;

    /* renamed from: in */
    private MqttInputStream f25509in;
    private final Object lifecycle;
    private Logger log = LoggerFactory.getLogger(LoggerFactory.MQTT_CLIENT_MSG_CAT, CLASS_NAME);
    private Thread recThread;
    private Future<?> receiverFuture;
    private State target_state;
    private String threadName;
    private CommsTokenStore tokenStore;

    public enum State {
        STOPPED,
        RUNNING,
        STARTING,
        RECEIVING;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static State[] valuesCustom() {
            State[] stateArrValuesCustom = values();
            int length = stateArrValuesCustom.length;
            State[] stateArr = new State[length];
            System.arraycopy(stateArrValuesCustom, 0, stateArr, 0, length);
            return stateArr;
        }
    }

    public CommsReceiver(ClientComms clientComms, ClientState clientState, CommsTokenStore commsTokenStore, InputStream inputStream) {
        State state = State.STOPPED;
        this.current_state = state;
        this.target_state = state;
        this.lifecycle = new Object();
        this.clientState = null;
        this.clientComms = null;
        this.tokenStore = null;
        this.recThread = null;
        this.f25509in = new MqttInputStream(clientState, inputStream);
        this.clientComms = clientComms;
        this.clientState = clientState;
        this.tokenStore = commsTokenStore;
        this.log.setResourceName(clientComms.getClient().getClientId());
    }

    public boolean isReceiving() {
        boolean z10;
        synchronized (this.lifecycle) {
            z10 = this.current_state == State.RECEIVING;
        }
        return z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean isRunning() {
        /*
            r4 = this;
            java.lang.Object r0 = r4.lifecycle
            monitor-enter(r0)
            org.eclipse.paho.client.mqttv3.internal.CommsReceiver$State r1 = r4.current_state     // Catch: java.lang.Throwable -> Le
            org.eclipse.paho.client.mqttv3.internal.CommsReceiver$State r2 = org.eclipse.paho.client.mqttv3.internal.CommsReceiver.State.RUNNING     // Catch: java.lang.Throwable -> Le
            if (r1 == r2) goto L10
            org.eclipse.paho.client.mqttv3.internal.CommsReceiver$State r3 = org.eclipse.paho.client.mqttv3.internal.CommsReceiver.State.RECEIVING     // Catch: java.lang.Throwable -> Le
            if (r1 != r3) goto L16
            goto L10
        Le:
            r1 = move-exception
            goto L19
        L10:
            org.eclipse.paho.client.mqttv3.internal.CommsReceiver$State r1 = r4.target_state     // Catch: java.lang.Throwable -> Le
            if (r1 != r2) goto L16
            r1 = 1
            goto L17
        L16:
            r1 = 0
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            return r1
        L19:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.eclipse.paho.client.mqttv3.internal.CommsReceiver.isRunning():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:131:0x013b, code lost:
    
        r2 = r9.lifecycle;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x013d, code lost:
    
        monitor-enter(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x013e, code lost:
    
        r9.current_state = org.eclipse.paho.client.mqttv3.internal.CommsReceiver.State.STOPPED;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0142, code lost:
    
        monitor-exit(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0143, code lost:
    
        r9.recThread = null;
        r9.log.fine(org.eclipse.paho.client.mqttv3.internal.CommsReceiver.CLASS_NAME, "run", "854");
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0150, code lost:
    
        return;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            Method dump skipped, instructions count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.eclipse.paho.client.mqttv3.internal.CommsReceiver.run():void");
    }

    public void start(String str, ExecutorService executorService) {
        this.threadName = str;
        this.log.fine(CLASS_NAME, "start", "855");
        synchronized (this.lifecycle) {
            try {
                State state = this.current_state;
                State state2 = State.STOPPED;
                if (state == state2 && this.target_state == state2) {
                    this.target_state = State.RUNNING;
                    if (executorService == null) {
                        new Thread(this).start();
                    } else {
                        this.receiverFuture = executorService.submit(this);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        while (!isRunning()) {
            try {
                Thread.sleep(100L);
            } catch (Exception unused) {
            }
        }
    }

    public void stop() {
        synchronized (this.lifecycle) {
            try {
                Future<?> future = this.receiverFuture;
                if (future != null) {
                    future.cancel(true);
                }
                this.log.fine(CLASS_NAME, "stop", "850");
                if (isRunning()) {
                    this.target_state = State.STOPPED;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        while (isRunning()) {
            try {
                Thread.sleep(100L);
            } catch (Exception unused) {
            }
        }
        this.log.fine(CLASS_NAME, "stop", "851");
    }
}
