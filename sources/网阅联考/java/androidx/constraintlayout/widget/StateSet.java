package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.SparseArray;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class StateSet {
    private static final boolean DEBUG = false;
    public static final String TAG = "ConstraintLayoutStates";
    ConstraintSet mDefaultConstraintSet;
    int mDefaultState = -1;
    int mCurrentStateId = -1;
    int mCurrentConstraintNumber = -1;
    private SparseArray<State> mStateList = new SparseArray<>();
    private SparseArray<ConstraintSet> mConstraintSetMap = new SparseArray<>();
    private ConstraintsChangedListener mConstraintsChangedListener = null;

    public static class State {
        int mConstraintID;
        int mId;
        boolean mIsLayout;
        ArrayList<Variant> mVariants = new ArrayList<>();

        public State(Context context, XmlPullParser xmlPullParser) throws Resources.NotFoundException {
            this.mConstraintID = -1;
            this.mIsLayout = false;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C1765R.styleable.State);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i4);
                if (index == C1765R.styleable.State_android_id) {
                    this.mId = typedArrayObtainStyledAttributes.getResourceId(index, this.mId);
                } else if (index == C1765R.styleable.State_constraints) {
                    this.mConstraintID = typedArrayObtainStyledAttributes.getResourceId(index, this.mConstraintID);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.mConstraintID);
                    context.getResources().getResourceName(this.mConstraintID);
                    if ("layout".equals(resourceTypeName)) {
                        this.mIsLayout = true;
                    }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        public void add(Variant variant) {
            this.mVariants.add(variant);
        }

        public int findMatch(float f4, float f5) {
            for (int i4 = 0; i4 < this.mVariants.size(); i4++) {
                if (this.mVariants.get(i4).match(f4, f5)) {
                    return i4;
                }
            }
            return -1;
        }
    }

    public static class Variant {
        int mConstraintID;
        int mId;
        boolean mIsLayout;
        float mMaxHeight;
        float mMaxWidth;
        float mMinHeight;
        float mMinWidth;

        public Variant(Context context, XmlPullParser xmlPullParser) throws Resources.NotFoundException {
            this.mMinWidth = Float.NaN;
            this.mMinHeight = Float.NaN;
            this.mMaxWidth = Float.NaN;
            this.mMaxHeight = Float.NaN;
            this.mConstraintID = -1;
            this.mIsLayout = false;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C1765R.styleable.Variant);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i4);
                if (index == C1765R.styleable.Variant_constraints) {
                    this.mConstraintID = typedArrayObtainStyledAttributes.getResourceId(index, this.mConstraintID);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.mConstraintID);
                    context.getResources().getResourceName(this.mConstraintID);
                    if ("layout".equals(resourceTypeName)) {
                        this.mIsLayout = true;
                    }
                } else if (index == C1765R.styleable.Variant_region_heightLessThan) {
                    this.mMaxHeight = typedArrayObtainStyledAttributes.getDimension(index, this.mMaxHeight);
                } else if (index == C1765R.styleable.Variant_region_heightMoreThan) {
                    this.mMinHeight = typedArrayObtainStyledAttributes.getDimension(index, this.mMinHeight);
                } else if (index == C1765R.styleable.Variant_region_widthLessThan) {
                    this.mMaxWidth = typedArrayObtainStyledAttributes.getDimension(index, this.mMaxWidth);
                } else if (index == C1765R.styleable.Variant_region_widthMoreThan) {
                    this.mMinWidth = typedArrayObtainStyledAttributes.getDimension(index, this.mMinWidth);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        public boolean match(float f4, float f5) {
            if (!Float.isNaN(this.mMinWidth) && f4 < this.mMinWidth) {
                return false;
            }
            if (!Float.isNaN(this.mMinHeight) && f5 < this.mMinHeight) {
                return false;
            }
            if (Float.isNaN(this.mMaxWidth) || f4 <= this.mMaxWidth) {
                return Float.isNaN(this.mMaxHeight) || f5 <= this.mMaxHeight;
            }
            return false;
        }
    }

    public StateSet(Context context, XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        load(context, xmlPullParser);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void load(android.content.Context r9, org.xmlpull.v1.XmlPullParser r10) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r8 = this;
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r10)
            int[] r1 = androidx.constraintlayout.widget.C1765R.styleable.StateSet
            android.content.res.TypedArray r0 = r9.obtainStyledAttributes(r0, r1)
            int r1 = r0.getIndexCount()
            r2 = 0
            r3 = r2
        L10:
            if (r3 >= r1) goto L25
            int r4 = r0.getIndex(r3)
            int r5 = androidx.constraintlayout.widget.C1765R.styleable.StateSet_defaultState
            if (r4 != r5) goto L22
            int r5 = r8.mDefaultState
            int r4 = r0.getResourceId(r4, r5)
            r8.mDefaultState = r4
        L22:
            int r3 = r3 + 1
            goto L10
        L25:
            int r0 = r10.getEventType()     // Catch: java.io.IOException -> Laf org.xmlpull.v1.XmlPullParserException -> Lb4
            r1 = 0
        L2a:
            r3 = 1
            if (r0 == r3) goto Lb8
            if (r0 == 0) goto La6
            java.lang.String r4 = "StateSet"
            r5 = 3
            r6 = 2
            if (r0 == r6) goto L44
            if (r0 == r5) goto L39
            goto La9
        L39:
            java.lang.String r0 = r10.getName()     // Catch: java.io.IOException -> Laf org.xmlpull.v1.XmlPullParserException -> Lb4
            boolean r0 = r4.equals(r0)     // Catch: java.io.IOException -> Laf org.xmlpull.v1.XmlPullParserException -> Lb4
            if (r0 == 0) goto La9
            return
        L44:
            java.lang.String r0 = r10.getName()     // Catch: java.io.IOException -> Laf org.xmlpull.v1.XmlPullParserException -> Lb4
            int r7 = r0.hashCode()     // Catch: java.io.IOException -> Laf org.xmlpull.v1.XmlPullParserException -> Lb4
            switch(r7) {
                case 80204913: goto L6c;
                case 1301459538: goto L62;
                case 1382829617: goto L5a;
                case 1901439077: goto L50;
                default: goto L4f;
            }     // Catch: java.io.IOException -> Laf org.xmlpull.v1.XmlPullParserException -> Lb4
        L4f:
            goto L76
        L50:
            java.lang.String r4 = "Variant"
            boolean r4 = r0.equals(r4)     // Catch: java.io.IOException -> Laf org.xmlpull.v1.XmlPullParserException -> Lb4
            if (r4 == 0) goto L76
            r4 = r5
            goto L77
        L5a:
            boolean r4 = r0.equals(r4)     // Catch: java.io.IOException -> Laf org.xmlpull.v1.XmlPullParserException -> Lb4
            if (r4 == 0) goto L76
            r4 = r3
            goto L77
        L62:
            java.lang.String r4 = "LayoutDescription"
            boolean r4 = r0.equals(r4)     // Catch: java.io.IOException -> Laf org.xmlpull.v1.XmlPullParserException -> Lb4
            if (r4 == 0) goto L76
            r4 = r2
            goto L77
        L6c:
            java.lang.String r4 = "State"
            boolean r4 = r0.equals(r4)     // Catch: java.io.IOException -> Laf org.xmlpull.v1.XmlPullParserException -> Lb4
            if (r4 == 0) goto L76
            r4 = r6
            goto L77
        L76:
            r4 = -1
        L77:
            if (r4 == 0) goto La9
            if (r4 == r3) goto La9
            if (r4 == r6) goto L99
            if (r4 == r5) goto L8e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.io.IOException -> Laf org.xmlpull.v1.XmlPullParserException -> Lb4
            r3.<init>()     // Catch: java.io.IOException -> Laf org.xmlpull.v1.XmlPullParserException -> Lb4
            java.lang.String r4 = "unknown tag "
            r3.append(r4)     // Catch: java.io.IOException -> Laf org.xmlpull.v1.XmlPullParserException -> Lb4
            r3.append(r0)     // Catch: java.io.IOException -> Laf org.xmlpull.v1.XmlPullParserException -> Lb4
            goto La9
        L8e:
            androidx.constraintlayout.widget.StateSet$Variant r0 = new androidx.constraintlayout.widget.StateSet$Variant     // Catch: java.io.IOException -> Laf org.xmlpull.v1.XmlPullParserException -> Lb4
            r0.<init>(r9, r10)     // Catch: java.io.IOException -> Laf org.xmlpull.v1.XmlPullParserException -> Lb4
            if (r1 == 0) goto La9
            r1.add(r0)     // Catch: java.io.IOException -> Laf org.xmlpull.v1.XmlPullParserException -> Lb4
            goto La9
        L99:
            androidx.constraintlayout.widget.StateSet$State r1 = new androidx.constraintlayout.widget.StateSet$State     // Catch: java.io.IOException -> Laf org.xmlpull.v1.XmlPullParserException -> Lb4
            r1.<init>(r9, r10)     // Catch: java.io.IOException -> Laf org.xmlpull.v1.XmlPullParserException -> Lb4
            android.util.SparseArray<androidx.constraintlayout.widget.StateSet$State> r0 = r8.mStateList     // Catch: java.io.IOException -> Laf org.xmlpull.v1.XmlPullParserException -> Lb4
            int r3 = r1.mId     // Catch: java.io.IOException -> Laf org.xmlpull.v1.XmlPullParserException -> Lb4
            r0.put(r3, r1)     // Catch: java.io.IOException -> Laf org.xmlpull.v1.XmlPullParserException -> Lb4
            goto La9
        La6:
            r10.getName()     // Catch: java.io.IOException -> Laf org.xmlpull.v1.XmlPullParserException -> Lb4
        La9:
            int r0 = r10.next()     // Catch: java.io.IOException -> Laf org.xmlpull.v1.XmlPullParserException -> Lb4
            goto L2a
        Laf:
            r9 = move-exception
            r9.printStackTrace()
            goto Lb8
        Lb4:
            r9 = move-exception
            r9.printStackTrace()
        Lb8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.StateSet.load(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }

    public int convertToConstraintSet(int i4, int i5, float f4, float f5) {
        State state = this.mStateList.get(i5);
        if (state == null) {
            return i5;
        }
        if (f4 == -1.0f || f5 == -1.0f) {
            if (state.mConstraintID == i4) {
                return i4;
            }
            Iterator<Variant> it = state.mVariants.iterator();
            while (it.hasNext()) {
                if (i4 == it.next().mConstraintID) {
                    return i4;
                }
            }
            return state.mConstraintID;
        }
        Iterator<Variant> it2 = state.mVariants.iterator();
        Variant variant = null;
        while (it2.hasNext()) {
            Variant next = it2.next();
            if (next.match(f4, f5)) {
                if (i4 == next.mConstraintID) {
                    return i4;
                }
                variant = next;
            }
        }
        return variant != null ? variant.mConstraintID : state.mConstraintID;
    }

    public boolean needsToChange(int i4, float f4, float f5) {
        int i5 = this.mCurrentStateId;
        if (i5 != i4) {
            return true;
        }
        State stateValueAt = i4 == -1 ? this.mStateList.valueAt(0) : this.mStateList.get(i5);
        int i6 = this.mCurrentConstraintNumber;
        return (i6 == -1 || !stateValueAt.mVariants.get(i6).match(f4, f5)) && this.mCurrentConstraintNumber != stateValueAt.findMatch(f4, f5);
    }

    public void setOnConstraintsChanged(ConstraintsChangedListener constraintsChangedListener) {
        this.mConstraintsChangedListener = constraintsChangedListener;
    }

    public int stateGetConstraintID(int i4, int i5, int i6) {
        return updateConstraints(-1, i4, i5, i6);
    }

    public int updateConstraints(int i4, int i5, float f4, float f5) {
        int iFindMatch;
        if (i4 == i5) {
            State stateValueAt = i5 == -1 ? this.mStateList.valueAt(0) : this.mStateList.get(this.mCurrentStateId);
            if (stateValueAt == null) {
                return -1;
            }
            return ((this.mCurrentConstraintNumber == -1 || !stateValueAt.mVariants.get(i4).match(f4, f5)) && i4 != (iFindMatch = stateValueAt.findMatch(f4, f5))) ? iFindMatch == -1 ? stateValueAt.mConstraintID : stateValueAt.mVariants.get(iFindMatch).mConstraintID : i4;
        }
        State state = this.mStateList.get(i5);
        if (state == null) {
            return -1;
        }
        int iFindMatch2 = state.findMatch(f4, f5);
        return iFindMatch2 == -1 ? state.mConstraintID : state.mVariants.get(iFindMatch2).mConstraintID;
    }
}
