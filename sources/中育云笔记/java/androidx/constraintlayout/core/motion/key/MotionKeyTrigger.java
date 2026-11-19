package androidx.constraintlayout.core.motion.key;

import androidx.constraintlayout.core.motion.CustomVariable;
import androidx.constraintlayout.core.motion.MotionWidget;
import androidx.constraintlayout.core.motion.utils.FloatRect;
import androidx.constraintlayout.core.motion.utils.SplineSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

/* loaded from: classes2.dex */
public class MotionKeyTrigger extends MotionKey {
    public static final String CROSS = "CROSS";
    public static final int KEY_TYPE = 5;
    public static final String NEGATIVE_CROSS = "negativeCross";
    public static final String POSITIVE_CROSS = "positiveCross";
    public static final String POST_LAYOUT = "postLayout";
    private static final String TAG = "KeyTrigger";
    public static final String TRIGGER_COLLISION_ID = "triggerCollisionId";
    public static final String TRIGGER_COLLISION_VIEW = "triggerCollisionView";
    public static final String TRIGGER_ID = "triggerID";
    public static final String TRIGGER_RECEIVER = "triggerReceiver";
    public static final String TRIGGER_SLACK = "triggerSlack";
    public static final int TYPE_CROSS = 312;
    public static final int TYPE_NEGATIVE_CROSS = 310;
    public static final int TYPE_POSITIVE_CROSS = 309;
    public static final int TYPE_POST_LAYOUT = 304;
    public static final int TYPE_TRIGGER_COLLISION_ID = 307;
    public static final int TYPE_TRIGGER_COLLISION_VIEW = 306;
    public static final int TYPE_TRIGGER_ID = 308;
    public static final int TYPE_TRIGGER_RECEIVER = 311;
    public static final int TYPE_TRIGGER_SLACK = 305;
    public static final int TYPE_VIEW_TRANSITION_ON_CROSS = 301;
    public static final int TYPE_VIEW_TRANSITION_ON_NEGATIVE_CROSS = 303;
    public static final int TYPE_VIEW_TRANSITION_ON_POSITIVE_CROSS = 302;
    public static final String VIEW_TRANSITION_ON_CROSS = "viewTransitionOnCross";
    public static final String VIEW_TRANSITION_ON_NEGATIVE_CROSS = "viewTransitionOnNegativeCross";
    public static final String VIEW_TRANSITION_ON_POSITIVE_CROSS = "viewTransitionOnPositiveCross";
    FloatRect mCollisionRect;
    private boolean mFireCrossReset;
    private float mFireLastPos;
    private boolean mFireNegativeReset;
    private boolean mFirePositiveReset;
    private float mFireThreshold;
    private String mNegativeCross;
    private String mPositiveCross;
    private boolean mPostLayout;
    FloatRect mTargetRect;
    private int mTriggerCollisionId;
    private int mTriggerID;
    private int mTriggerReceiver;
    float mTriggerSlack;
    int mViewTransitionOnCross;
    int mViewTransitionOnNegativeCross;
    int mViewTransitionOnPositiveCross;
    private int mCurveFit = -1;
    private String mCross = null;

    public MotionKeyTrigger() {
        int i10 = MotionKey.UNSET;
        this.mTriggerReceiver = i10;
        this.mNegativeCross = null;
        this.mPositiveCross = null;
        this.mTriggerID = i10;
        this.mTriggerCollisionId = i10;
        this.mTriggerSlack = 0.1f;
        this.mFireCrossReset = true;
        this.mFireNegativeReset = true;
        this.mFirePositiveReset = true;
        this.mFireThreshold = Float.NaN;
        this.mPostLayout = false;
        this.mViewTransitionOnNegativeCross = i10;
        this.mViewTransitionOnPositiveCross = i10;
        this.mViewTransitionOnCross = i10;
        this.mCollisionRect = new FloatRect();
        this.mTargetRect = new FloatRect();
        this.mType = 5;
        this.mCustom = new HashMap<>();
    }

    private void fireCustom(String str, MotionWidget motionWidget) {
        boolean z10 = str.length() == 1;
        if (!z10) {
            str = str.substring(1).toLowerCase(Locale.ROOT);
        }
        for (String str2 : this.mCustom.keySet()) {
            String lowerCase = str2.toLowerCase(Locale.ROOT);
            if (z10 || lowerCase.matches(str)) {
                CustomVariable customVariable = this.mCustom.get(str2);
                if (customVariable != null) {
                    customVariable.applyToWidget(motionWidget);
                }
            }
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public void addValues(HashMap<String, SplineSet> map) {
    }

    public void conditionallyFire(float f10, MotionWidget motionWidget) {
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public void getAttributeNames(HashSet<String> hashSet) {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:4:0x000b  */
    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int getId(java.lang.String r3) {
        /*
            r2 = this;
            r3.getClass()
            int r0 = r3.hashCode()
            r1 = -1
            switch(r0) {
                case -1594793529: goto L8b;
                case -966421266: goto L7f;
                case -786670827: goto L73;
                case -648752941: goto L67;
                case -638126837: goto L5c;
                case -76025313: goto L50;
                case -9754574: goto L44;
                case 364489912: goto L38;
                case 1301930599: goto L2a;
                case 1401391082: goto L1c;
                case 1535404999: goto Le;
                default: goto Lb;
            }
        Lb:
            r3 = r1
            goto L97
        Le:
            java.lang.String r0 = "triggerReceiver"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L18
            goto Lb
        L18:
            r3 = 10
            goto L97
        L1c:
            java.lang.String r0 = "postLayout"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L26
            goto Lb
        L26:
            r3 = 9
            goto L97
        L2a:
            java.lang.String r0 = "viewTransitionOnCross"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L34
            goto Lb
        L34:
            r3 = 8
            goto L97
        L38:
            java.lang.String r0 = "triggerSlack"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L42
            goto Lb
        L42:
            r3 = 7
            goto L97
        L44:
            java.lang.String r0 = "viewTransitionOnNegativeCross"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L4e
            goto Lb
        L4e:
            r3 = 6
            goto L97
        L50:
            java.lang.String r0 = "triggerCollisionView"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L5a
            goto Lb
        L5a:
            r3 = 5
            goto L97
        L5c:
            java.lang.String r0 = "negativeCross"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L65
            goto Lb
        L65:
            r3 = 4
            goto L97
        L67:
            java.lang.String r0 = "triggerID"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L71
            goto Lb
        L71:
            r3 = 3
            goto L97
        L73:
            java.lang.String r0 = "triggerCollisionId"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L7d
            goto Lb
        L7d:
            r3 = 2
            goto L97
        L7f:
            java.lang.String r0 = "viewTransitionOnPositiveCross"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L89
            goto Lb
        L89:
            r3 = 1
            goto L97
        L8b:
            java.lang.String r0 = "positiveCross"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L96
            goto Lb
        L96:
            r3 = 0
        L97:
            switch(r3) {
                case 0: goto Lb9;
                case 1: goto Lb6;
                case 2: goto Lb3;
                case 3: goto Lb0;
                case 4: goto Lad;
                case 5: goto Laa;
                case 6: goto La7;
                case 7: goto La4;
                case 8: goto La1;
                case 9: goto L9e;
                case 10: goto L9b;
                default: goto L9a;
            }
        L9a:
            return r1
        L9b:
            r3 = 311(0x137, float:4.36E-43)
            return r3
        L9e:
            r3 = 304(0x130, float:4.26E-43)
            return r3
        La1:
            r3 = 301(0x12d, float:4.22E-43)
            return r3
        La4:
            r3 = 305(0x131, float:4.27E-43)
            return r3
        La7:
            r3 = 303(0x12f, float:4.25E-43)
            return r3
        Laa:
            r3 = 306(0x132, float:4.29E-43)
            return r3
        Lad:
            r3 = 310(0x136, float:4.34E-43)
            return r3
        Lb0:
            r3 = 308(0x134, float:4.32E-43)
            return r3
        Lb3:
            r3 = 307(0x133, float:4.3E-43)
            return r3
        Lb6:
            r3 = 302(0x12e, float:4.23E-43)
            return r3
        Lb9:
            r3 = 309(0x135, float:4.33E-43)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.motion.key.MotionKeyTrigger.getId(java.lang.String):int");
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i10, int i11) {
        if (i10 == 307) {
            this.mTriggerCollisionId = i11;
            return true;
        }
        if (i10 == 308) {
            this.mTriggerID = toInt(Integer.valueOf(i11));
            return true;
        }
        if (i10 == 311) {
            this.mTriggerReceiver = i11;
            return true;
        }
        switch (i10) {
            case 301:
                this.mViewTransitionOnCross = i11;
                return true;
            case 302:
                this.mViewTransitionOnPositiveCross = i11;
                return true;
            case 303:
                this.mViewTransitionOnNegativeCross = i11;
                return true;
            default:
                return super.setValue(i10, i11);
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    /* renamed from: clone */
    public MotionKey mo33770clone() {
        return new MotionKeyTrigger().copy((MotionKey) this);
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public MotionKeyTrigger copy(MotionKey motionKey) {
        super.copy(motionKey);
        MotionKeyTrigger motionKeyTrigger = (MotionKeyTrigger) motionKey;
        this.mCurveFit = motionKeyTrigger.mCurveFit;
        this.mCross = motionKeyTrigger.mCross;
        this.mTriggerReceiver = motionKeyTrigger.mTriggerReceiver;
        this.mNegativeCross = motionKeyTrigger.mNegativeCross;
        this.mPositiveCross = motionKeyTrigger.mPositiveCross;
        this.mTriggerID = motionKeyTrigger.mTriggerID;
        this.mTriggerCollisionId = motionKeyTrigger.mTriggerCollisionId;
        this.mTriggerSlack = motionKeyTrigger.mTriggerSlack;
        this.mFireCrossReset = motionKeyTrigger.mFireCrossReset;
        this.mFireNegativeReset = motionKeyTrigger.mFireNegativeReset;
        this.mFirePositiveReset = motionKeyTrigger.mFirePositiveReset;
        this.mFireThreshold = motionKeyTrigger.mFireThreshold;
        this.mFireLastPos = motionKeyTrigger.mFireLastPos;
        this.mPostLayout = motionKeyTrigger.mPostLayout;
        this.mCollisionRect = motionKeyTrigger.mCollisionRect;
        this.mTargetRect = motionKeyTrigger.mTargetRect;
        return this;
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i10, float f10) {
        if (i10 != 305) {
            return super.setValue(i10, f10);
        }
        this.mTriggerSlack = f10;
        return true;
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i10, String str) {
        if (i10 == 309) {
            this.mPositiveCross = str;
            return true;
        }
        if (i10 == 310) {
            this.mNegativeCross = str;
            return true;
        }
        if (i10 != 312) {
            return super.setValue(i10, str);
        }
        this.mCross = str;
        return true;
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i10, boolean z10) {
        if (i10 != 304) {
            return super.setValue(i10, z10);
        }
        this.mPostLayout = z10;
        return true;
    }
}
