package androidx.work.impl.model;

import android.net.NetworkRequest;
import android.net.Uri;
import android.os.Build;
import androidx.room.TypeConverter;
import androidx.work.BackoffPolicy;
import androidx.work.Constraints;
import androidx.work.NetworkType;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo;
import androidx.work.impl.utils.NetworkRequest28;
import androidx.work.impl.utils.NetworkRequestCompat;
import androidx.work.impl.utils.NetworkRequestCompatKt;
import cd.AbstractC5423b;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC9979u;
import p309qc.C10786q;

/* loaded from: classes3.dex */
public final class WorkTypeConverters {
    public static final WorkTypeConverters INSTANCE = new WorkTypeConverters();

    public static final class BackoffPolicyIds {
        public static final int EXPONENTIAL = 0;
        public static final BackoffPolicyIds INSTANCE = new BackoffPolicyIds();
        public static final int LINEAR = 1;

        private BackoffPolicyIds() {
        }
    }

    public static final class NetworkTypeIds {
        public static final int CONNECTED = 1;
        public static final NetworkTypeIds INSTANCE = new NetworkTypeIds();
        public static final int METERED = 4;
        public static final int NOT_REQUIRED = 0;
        public static final int NOT_ROAMING = 3;
        public static final int TEMPORARILY_UNMETERED = 5;
        public static final int UNMETERED = 2;

        private NetworkTypeIds() {
        }
    }

    public static final class OutOfPolicyIds {
        public static final int DROP_WORK_REQUEST = 1;
        public static final OutOfPolicyIds INSTANCE = new OutOfPolicyIds();
        public static final int RUN_AS_NON_EXPEDITED_WORK_REQUEST = 0;

        private OutOfPolicyIds() {
        }
    }

    public static final class StateIds {
        public static final int BLOCKED = 4;
        public static final int CANCELLED = 5;
        public static final String COMPLETED_STATES = "(2, 3, 5)";
        public static final int ENQUEUED = 0;
        public static final int FAILED = 3;
        public static final StateIds INSTANCE = new StateIds();
        public static final int RUNNING = 1;
        public static final int SUCCEEDED = 2;

        private StateIds() {
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[WorkInfo.State.values().length];
            try {
                iArr[WorkInfo.State.ENQUEUED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WorkInfo.State.RUNNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WorkInfo.State.SUCCEEDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[WorkInfo.State.FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[WorkInfo.State.BLOCKED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[WorkInfo.State.CANCELLED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[BackoffPolicy.values().length];
            try {
                iArr2[BackoffPolicy.EXPONENTIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[BackoffPolicy.LINEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[NetworkType.values().length];
            try {
                iArr3[NetworkType.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[NetworkType.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[NetworkType.UNMETERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[NetworkType.NOT_ROAMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[NetworkType.METERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[OutOfQuotaPolicy.values().length];
            try {
                iArr4[OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr4[OutOfQuotaPolicy.DROP_WORK_REQUEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }

    private WorkTypeConverters() {
    }

    @TypeConverter
    public static final int backoffPolicyToInt(BackoffPolicy backoffPolicy) {
        AbstractC9979u.m20294g(backoffPolicy, "backoffPolicy");
        int i10 = WhenMappings.$EnumSwitchMapping$1[backoffPolicy.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        throw new NoWhenBranchMatchedException();
    }

    @TypeConverter
    public static final Set<Constraints.ContentUriTrigger> byteArrayToSetOfTriggers(byte[] bytes) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        ObjectInputStream objectInputStream;
        AbstractC9979u.m20294g(bytes, "bytes");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (bytes.length == 0) {
            return linkedHashSet;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        try {
            try {
                objectInputStream = new ObjectInputStream(byteArrayInputStream);
            } catch (IOException e10) {
                e10.printStackTrace();
            }
            try {
                int i10 = objectInputStream.readInt();
                for (int i11 = 0; i11 < i10; i11++) {
                    Uri uri = Uri.parse(objectInputStream.readUTF());
                    boolean z10 = objectInputStream.readBoolean();
                    AbstractC9979u.m20293f(uri, "uri");
                    linkedHashSet.add(new Constraints.ContentUriTrigger(uri, z10));
                }
                C10786q c10786q = C10786q.f26013a;
                AbstractC5423b.m2902a(objectInputStream, null);
                C10786q c10786q2 = C10786q.f26013a;
                AbstractC5423b.m2902a(byteArrayInputStream, null);
                return linkedHashSet;
            } finally {
            }
        } finally {
        }
    }

    @TypeConverter
    public static final byte[] fromNetworkRequest$work_runtime_release(NetworkRequestCompat requestCompat) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        AbstractC9979u.m20294g(requestCompat, "requestCompat");
        if (Build.VERSION.SDK_INT < 28) {
            return new byte[0];
        }
        NetworkRequest networkRequest = requestCompat.getNetworkRequest();
        if (networkRequest == null) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                int[] transportTypesCompat = NetworkRequestCompatKt.getTransportTypesCompat(networkRequest);
                int[] capabilitiesCompat = NetworkRequestCompatKt.getCapabilitiesCompat(networkRequest);
                objectOutputStream.writeInt(transportTypesCompat.length);
                for (int i10 : transportTypesCompat) {
                    objectOutputStream.writeInt(i10);
                }
                objectOutputStream.writeInt(capabilitiesCompat.length);
                for (int i11 : capabilitiesCompat) {
                    objectOutputStream.writeInt(i11);
                }
                C10786q c10786q = C10786q.f26013a;
                AbstractC5423b.m2902a(objectOutputStream, null);
                AbstractC5423b.m2902a(byteArrayOutputStream, null);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                AbstractC9979u.m20293f(byteArray, "outputStream.toByteArray()");
                return byteArray;
            } finally {
            }
        } finally {
        }
    }

    @TypeConverter
    public static final BackoffPolicy intToBackoffPolicy(int i10) {
        if (i10 == 0) {
            return BackoffPolicy.EXPONENTIAL;
        }
        if (i10 == 1) {
            return BackoffPolicy.LINEAR;
        }
        throw new IllegalArgumentException("Could not convert " + i10 + " to BackoffPolicy");
    }

    @TypeConverter
    public static final NetworkType intToNetworkType(int i10) {
        if (i10 == 0) {
            return NetworkType.NOT_REQUIRED;
        }
        if (i10 == 1) {
            return NetworkType.CONNECTED;
        }
        if (i10 == 2) {
            return NetworkType.UNMETERED;
        }
        if (i10 == 3) {
            return NetworkType.NOT_ROAMING;
        }
        if (i10 == 4) {
            return NetworkType.METERED;
        }
        if (Build.VERSION.SDK_INT >= 30 && i10 == 5) {
            return NetworkType.TEMPORARILY_UNMETERED;
        }
        throw new IllegalArgumentException("Could not convert " + i10 + " to NetworkType");
    }

    @TypeConverter
    public static final OutOfQuotaPolicy intToOutOfQuotaPolicy(int i10) {
        if (i10 == 0) {
            return OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        }
        if (i10 == 1) {
            return OutOfQuotaPolicy.DROP_WORK_REQUEST;
        }
        throw new IllegalArgumentException("Could not convert " + i10 + " to OutOfQuotaPolicy");
    }

    @TypeConverter
    public static final WorkInfo.State intToState(int i10) {
        if (i10 == 0) {
            return WorkInfo.State.ENQUEUED;
        }
        if (i10 == 1) {
            return WorkInfo.State.RUNNING;
        }
        if (i10 == 2) {
            return WorkInfo.State.SUCCEEDED;
        }
        if (i10 == 3) {
            return WorkInfo.State.FAILED;
        }
        if (i10 == 4) {
            return WorkInfo.State.BLOCKED;
        }
        if (i10 == 5) {
            return WorkInfo.State.CANCELLED;
        }
        throw new IllegalArgumentException("Could not convert " + i10 + " to State");
    }

    @TypeConverter
    public static final int networkTypeToInt(NetworkType networkType) {
        AbstractC9979u.m20294g(networkType, "networkType");
        int i10 = WhenMappings.$EnumSwitchMapping$2[networkType.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        if (i10 == 3) {
            return 2;
        }
        if (i10 == 4) {
            return 3;
        }
        if (i10 == 5) {
            return 4;
        }
        if (Build.VERSION.SDK_INT >= 30 && networkType == NetworkType.TEMPORARILY_UNMETERED) {
            return 5;
        }
        throw new IllegalArgumentException("Could not convert " + networkType + " to int");
    }

    @TypeConverter
    public static final int outOfQuotaPolicyToInt(OutOfQuotaPolicy policy) {
        AbstractC9979u.m20294g(policy, "policy");
        int i10 = WhenMappings.$EnumSwitchMapping$3[policy.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        throw new NoWhenBranchMatchedException();
    }

    @TypeConverter
    public static final byte[] setOfTriggersToByteArray(Set<Constraints.ContentUriTrigger> triggers) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        AbstractC9979u.m20294g(triggers, "triggers");
        if (triggers.isEmpty()) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                objectOutputStream.writeInt(triggers.size());
                for (Constraints.ContentUriTrigger contentUriTrigger : triggers) {
                    objectOutputStream.writeUTF(contentUriTrigger.getUri().toString());
                    objectOutputStream.writeBoolean(contentUriTrigger.isTriggeredForDescendants());
                }
                C10786q c10786q = C10786q.f26013a;
                AbstractC5423b.m2902a(objectOutputStream, null);
                AbstractC5423b.m2902a(byteArrayOutputStream, null);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                AbstractC9979u.m20293f(byteArray, "outputStream.toByteArray()");
                return byteArray;
            } finally {
            }
        } finally {
        }
    }

    @TypeConverter
    public static final int stateToInt(WorkInfo.State state) {
        AbstractC9979u.m20294g(state, "state");
        switch (WhenMappings.$EnumSwitchMapping$0[state.ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @TypeConverter
    public static final NetworkRequestCompat toNetworkRequest$work_runtime_release(byte[] bytes) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        AbstractC9979u.m20294g(bytes, "bytes");
        if (Build.VERSION.SDK_INT < 28 || bytes.length == 0) {
            return new NetworkRequestCompat(null);
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            try {
                int i10 = objectInputStream.readInt();
                int[] iArr = new int[i10];
                for (int i11 = 0; i11 < i10; i11++) {
                    iArr[i11] = objectInputStream.readInt();
                }
                int i12 = objectInputStream.readInt();
                int[] iArr2 = new int[i12];
                for (int i13 = 0; i13 < i12; i13++) {
                    iArr2[i13] = objectInputStream.readInt();
                }
                NetworkRequestCompat networkRequestCompatCreateNetworkRequestCompat$work_runtime_release = NetworkRequest28.INSTANCE.createNetworkRequestCompat$work_runtime_release(iArr2, iArr);
                AbstractC5423b.m2902a(objectInputStream, null);
                AbstractC5423b.m2902a(byteArrayInputStream, null);
                return networkRequestCompatCreateNetworkRequestCompat$work_runtime_release;
            } finally {
            }
        } finally {
        }
    }
}
