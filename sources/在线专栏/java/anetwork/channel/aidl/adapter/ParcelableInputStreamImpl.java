package anetwork.channel.aidl.adapter;

import android.os.RemoteException;
import anet.channel.bytes.ByteArray;
import anetwork.channel.aidl.ParcelableInputStream;
import anetwork.channel.entity.C0998g;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public class ParcelableInputStreamImpl extends ParcelableInputStream.Stub {
    private static final ByteArray EOS = ByteArray.create(0);
    private static final String TAG = "anet.ParcelableInputStreamImpl";
    private int blockIndex;
    private int blockOffset;
    private int contentLength;
    final ReentrantLock lock;
    final Condition newDataArrive;
    private final AtomicBoolean isClosed = new AtomicBoolean(false);
    private LinkedList<ByteArray> byteList = new LinkedList<>();
    private int rto = 10000;
    private String seqNo = "";

    public ParcelableInputStreamImpl() {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.lock = reentrantLock;
        this.newDataArrive = reentrantLock.newCondition();
    }

    private void recycleCurrentItem() {
        this.lock.lock();
        try {
            this.byteList.set(this.blockIndex, EOS).recycle();
        } finally {
            this.lock.unlock();
        }
    }

    @Override // anetwork.channel.aidl.ParcelableInputStream
    public int available() throws RemoteException {
        if (this.isClosed.get()) {
            throw new RuntimeException("Stream is closed");
        }
        this.lock.lock();
        try {
            int dataLength = 0;
            if (this.blockIndex == this.byteList.size()) {
                return 0;
            }
            ListIterator<ByteArray> listIterator = this.byteList.listIterator(this.blockIndex);
            while (listIterator.hasNext()) {
                dataLength += listIterator.next().getDataLength();
            }
            return dataLength - this.blockOffset;
        } finally {
            this.lock.unlock();
        }
    }

    @Override // anetwork.channel.aidl.ParcelableInputStream
    public void close() throws RemoteException {
        if (this.isClosed.compareAndSet(false, true)) {
            this.lock.lock();
            try {
                Iterator<ByteArray> it = this.byteList.iterator();
                while (it.hasNext()) {
                    ByteArray next = it.next();
                    if (next != EOS) {
                        next.recycle();
                    }
                }
                this.byteList.clear();
                this.byteList = null;
                this.blockIndex = -1;
                this.blockOffset = -1;
                this.contentLength = 0;
            } finally {
                this.lock.unlock();
            }
        }
    }

    public void init(C0998g c0998g, int i4) {
        this.contentLength = i4;
        this.seqNo = c0998g.f5629e;
        this.rto = c0998g.f5628d;
    }

    @Override // anetwork.channel.aidl.ParcelableInputStream
    public int length() throws RemoteException {
        return this.contentLength;
    }

    @Override // anetwork.channel.aidl.ParcelableInputStream
    public int read(byte[] bArr) throws RemoteException {
        return readBytes(bArr, 0, bArr.length);
    }

    @Override // anetwork.channel.aidl.ParcelableInputStream
    public int readByte() throws RemoteException {
        byte b4;
        if (this.isClosed.get()) {
            throw new RuntimeException("Stream is closed");
        }
        this.lock.lock();
        while (true) {
            try {
                try {
                    if (this.blockIndex == this.byteList.size() && !this.newDataArrive.await(this.rto, TimeUnit.MILLISECONDS)) {
                        close();
                        throw new RuntimeException("await timeout.");
                    }
                    ByteArray byteArray = this.byteList.get(this.blockIndex);
                    if (byteArray == EOS) {
                        b4 = -1;
                        break;
                    }
                    if (this.blockOffset < byteArray.getDataLength()) {
                        byte[] buffer = byteArray.getBuffer();
                        int i4 = this.blockOffset;
                        b4 = buffer[i4];
                        this.blockOffset = i4 + 1;
                        break;
                    }
                    recycleCurrentItem();
                    this.blockIndex++;
                    this.blockOffset = 0;
                } catch (InterruptedException unused) {
                    close();
                    throw new RuntimeException("await interrupt");
                }
            } finally {
                this.lock.unlock();
            }
        }
        return b4;
    }

    @Override // anetwork.channel.aidl.ParcelableInputStream
    public int readBytes(byte[] bArr, int i4, int i5) throws RemoteException {
        int i6;
        if (this.isClosed.get()) {
            throw new RuntimeException("Stream is closed");
        }
        Objects.requireNonNull(bArr);
        if (i4 < 0 || i5 < 0 || (i6 = i5 + i4) > bArr.length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        this.lock.lock();
        int i7 = i4;
        while (i7 < i6) {
            try {
                try {
                    if (this.blockIndex == this.byteList.size() && !this.newDataArrive.await(this.rto, TimeUnit.MILLISECONDS)) {
                        close();
                        throw new RuntimeException("await timeout.");
                    }
                    ByteArray byteArray = this.byteList.get(this.blockIndex);
                    if (byteArray == EOS) {
                        break;
                    }
                    int dataLength = byteArray.getDataLength() - this.blockOffset;
                    int i8 = i6 - i7;
                    if (dataLength < i8) {
                        System.arraycopy(byteArray.getBuffer(), this.blockOffset, bArr, i7, dataLength);
                        i7 += dataLength;
                        recycleCurrentItem();
                        this.blockIndex++;
                        this.blockOffset = 0;
                    } else {
                        System.arraycopy(byteArray.getBuffer(), this.blockOffset, bArr, i7, i8);
                        this.blockOffset += i8;
                        i7 += i8;
                    }
                } catch (InterruptedException unused) {
                    close();
                    throw new RuntimeException("await interrupt");
                }
            } catch (Throwable th) {
                this.lock.unlock();
                throw th;
            }
        }
        this.lock.unlock();
        int i9 = i7 - i4;
        if (i9 > 0) {
            return i9;
        }
        return -1;
    }

    @Override // anetwork.channel.aidl.ParcelableInputStream
    public long skip(int i4) throws RemoteException {
        ByteArray byteArray;
        this.lock.lock();
        int i5 = 0;
        while (i5 < i4) {
            try {
                if (this.blockIndex != this.byteList.size() && (byteArray = this.byteList.get(this.blockIndex)) != EOS) {
                    int dataLength = byteArray.getDataLength();
                    int i6 = this.blockOffset;
                    int i7 = i4 - i5;
                    if (dataLength - i6 < i7) {
                        i5 += dataLength - i6;
                        recycleCurrentItem();
                        this.blockIndex++;
                        this.blockOffset = 0;
                    } else {
                        this.blockOffset = i6 + i7;
                        i5 = i4;
                    }
                }
            } catch (Throwable th) {
                this.lock.unlock();
                throw th;
            }
        }
        this.lock.unlock();
        return i5;
    }

    public void write(ByteArray byteArray) {
        if (this.isClosed.get()) {
            return;
        }
        this.lock.lock();
        try {
            this.byteList.add(byteArray);
            this.newDataArrive.signal();
        } finally {
            this.lock.unlock();
        }
    }

    public void writeEnd() {
        write(EOS);
    }
}
