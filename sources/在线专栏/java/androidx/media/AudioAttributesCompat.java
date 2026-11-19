package androidx.media;

import android.util.SparseIntArray;
import p161v0.InterfaceC3417a;

/* loaded from: classes.dex */
public class AudioAttributesCompat implements InterfaceC3417a {

    /* renamed from: b */
    private static final SparseIntArray f3478b;

    /* renamed from: c */
    private static final int[] f3479c;

    /* renamed from: a */
    AudioAttributesImpl f3480a;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f3478b = sparseIntArray;
        sparseIntArray.put(5, 1);
        sparseIntArray.put(6, 2);
        sparseIntArray.put(7, 2);
        sparseIntArray.put(8, 1);
        sparseIntArray.put(9, 1);
        sparseIntArray.put(10, 1);
        f3479c = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 16};
    }

    AudioAttributesCompat() {
    }

    /* renamed from: a */
    static int m2931a(boolean z3, int i4, int i5) {
        if ((i4 & 1) == 1) {
            return z3 ? 1 : 7;
        }
        if ((i4 & 4) == 4) {
            return z3 ? 0 : 6;
        }
        switch (i5) {
            case 0:
                return z3 ? Integer.MIN_VALUE : 3;
            case 1:
            case 12:
            case 14:
            case 16:
                return 3;
            case 2:
                return 0;
            case 3:
                return z3 ? 0 : 8;
            case 4:
                return 4;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                return 5;
            case 6:
                return 2;
            case 11:
                return 10;
            case 13:
                return 1;
            case 15:
            default:
                if (!z3) {
                    return 3;
                }
                throw new IllegalArgumentException("Unknown usage value " + i5 + " in audio attributes");
        }
    }

    /* renamed from: b */
    static String m2932b(int i4) {
        switch (i4) {
            case 0:
                return "USAGE_UNKNOWN";
            case 1:
                return "USAGE_MEDIA";
            case 2:
                return "USAGE_VOICE_COMMUNICATION";
            case 3:
                return "USAGE_VOICE_COMMUNICATION_SIGNALLING";
            case 4:
                return "USAGE_ALARM";
            case 5:
                return "USAGE_NOTIFICATION";
            case 6:
                return "USAGE_NOTIFICATION_RINGTONE";
            case 7:
                return "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
            case 8:
                return "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
            case 9:
                return "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
            case 10:
                return "USAGE_NOTIFICATION_EVENT";
            case 11:
                return "USAGE_ASSISTANCE_ACCESSIBILITY";
            case 12:
                return "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
            case 13:
                return "USAGE_ASSISTANCE_SONIFICATION";
            case 14:
                return "USAGE_GAME";
            case 15:
            default:
                return "unknown usage " + i4;
            case 16:
                return "USAGE_ASSISTANT";
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesCompat)) {
            return false;
        }
        AudioAttributesCompat audioAttributesCompat = (AudioAttributesCompat) obj;
        AudioAttributesImpl audioAttributesImpl = this.f3480a;
        return audioAttributesImpl == null ? audioAttributesCompat.f3480a == null : audioAttributesImpl.equals(audioAttributesCompat.f3480a);
    }

    public int hashCode() {
        return this.f3480a.hashCode();
    }

    public String toString() {
        return this.f3480a.toString();
    }
}
