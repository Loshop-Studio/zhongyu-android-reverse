package anetwork.channel.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes3.dex */
public interface ParcelableInputStream extends IInterface {

    public static abstract class Stub extends Binder implements ParcelableInputStream {
        private static final String DESCRIPTOR = "anetwork.channel.aidl.ParcelableInputStream";
        static final int TRANSACTION_available = 1;
        static final int TRANSACTION_close = 2;
        static final int TRANSACTION_length = 7;
        static final int TRANSACTION_read = 5;
        static final int TRANSACTION_readByte = 3;
        static final int TRANSACTION_readBytes = 4;
        static final int TRANSACTION_skip = 6;

        public static class Proxy implements ParcelableInputStream {

            /* renamed from: a */
            private IBinder f2795a;

            public Proxy(IBinder iBinder) {
                this.f2795a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f2795a;
            }

            @Override // anetwork.channel.aidl.ParcelableInputStream
            public int available() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.f2795a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // anetwork.channel.aidl.ParcelableInputStream
            public void close() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.f2795a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // anetwork.channel.aidl.ParcelableInputStream
            public int length() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.f2795a.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // anetwork.channel.aidl.ParcelableInputStream
            public int read(byte[] bArr) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (bArr == null) {
                        parcelObtain.writeInt(-1);
                    } else {
                        parcelObtain.writeInt(bArr.length);
                    }
                    this.f2795a.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    int i10 = parcelObtain2.readInt();
                    parcelObtain2.readByteArray(bArr);
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    return i10;
                } catch (Throwable th) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th;
                }
            }

            @Override // anetwork.channel.aidl.ParcelableInputStream
            public int readByte() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.f2795a.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // anetwork.channel.aidl.ParcelableInputStream
            public int readBytes(byte[] bArr, int i10, int i11) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (bArr == null) {
                        parcelObtain.writeInt(-1);
                    } else {
                        parcelObtain.writeInt(bArr.length);
                    }
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeInt(i11);
                    this.f2795a.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    int i12 = parcelObtain2.readInt();
                    parcelObtain2.readByteArray(bArr);
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    return i12;
                } catch (Throwable th) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th;
                }
            }

            @Override // anetwork.channel.aidl.ParcelableInputStream
            public long skip(int i10) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i10);
                    this.f2795a.transact(6, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readLong();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static ParcelableInputStream asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof ParcelableInputStream)) ? new Proxy(iBinder) : (ParcelableInputStream) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            byte[] bArr;
            if (i10 == 1598968902) {
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
            switch (i10) {
                case 1:
                    parcel.enforceInterface(DESCRIPTOR);
                    int iAvailable = available();
                    parcel2.writeNoException();
                    parcel2.writeInt(iAvailable);
                    return true;
                case 2:
                    parcel.enforceInterface(DESCRIPTOR);
                    close();
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface(DESCRIPTOR);
                    int i12 = readByte();
                    parcel2.writeNoException();
                    parcel2.writeInt(i12);
                    return true;
                case 4:
                    parcel.enforceInterface(DESCRIPTOR);
                    int i13 = parcel.readInt();
                    bArr = i13 >= 0 ? new byte[i13] : null;
                    int bytes = readBytes(bArr, parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(bytes);
                    parcel2.writeByteArray(bArr);
                    return true;
                case 5:
                    parcel.enforceInterface(DESCRIPTOR);
                    int i14 = parcel.readInt();
                    bArr = i14 >= 0 ? new byte[i14] : null;
                    int i15 = read(bArr);
                    parcel2.writeNoException();
                    parcel2.writeInt(i15);
                    parcel2.writeByteArray(bArr);
                    return true;
                case 6:
                    parcel.enforceInterface(DESCRIPTOR);
                    long jSkip = skip(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeLong(jSkip);
                    return true;
                case 7:
                    parcel.enforceInterface(DESCRIPTOR);
                    int length = length();
                    parcel2.writeNoException();
                    parcel2.writeInt(length);
                    return true;
                default:
                    return super.onTransact(i10, parcel, parcel2, i11);
            }
        }
    }

    int available();

    void close();

    int length();

    int read(byte[] bArr);

    int readByte();

    int readBytes(byte[] bArr, int i10, int i11);

    long skip(int i10);
}
