package com.tendcloud.dot;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import androidx.camera.core.CameraInfo;
import com.tendcloud.tenddata.C7896ca;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

/* loaded from: classes5.dex */
public class LayoutInflaterHooker {
    public static boolean hookLayoutXmlOnClick = false;

    public static void hookLayoutInflater(Context context) {
        if (hookLayoutXmlOnClick) {
            try {
                LayoutInflater.from(context).setFactory(LayoutInflaterOnClickFactory.createFactory());
            } catch (Throwable th) {
                C7896ca.eForInternal(th);
            }
        }
    }

    public static class LayoutInflaterOnClickFactory implements LayoutInflater.Factory {
        final Object[] mConstructorArgs = new Object[2];
        private static final String[] sClassPrefixList = {"android.widget.", "android.webkit.", "android.app.", "android.view."};
        static final Class<?>[] mConstructorSignature = {Context.class, AttributeSet.class};
        private static final HashMap<String, Constructor<? extends View>> sConstructorMap = new HashMap<>();
        private static final ClassLoader BOOT_CLASS_LOADER = LayoutInflater.class.getClassLoader();

        public static LayoutInflater.Factory createFactory() {
            return new LayoutInflaterOnClickFactory();
        }

        private View createView(String str, Context context, AttributeSet attributeSet) {
            if (-1 == str.indexOf(46)) {
                return layoutInflaterOnCreateView(context, str, attributeSet);
            }
            try {
                return layoutInflaterOnCreateView(context, str, null, attributeSet);
            } catch (ClassNotFoundException e10) {
                e10.printStackTrace();
                return null;
            }
        }

        private View layoutInflaterOnCreateView(Context context, String str, AttributeSet attributeSet) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, InstantiationException, SecurityException, IllegalArgumentException, InvocationTargetException {
            View viewLayoutInflaterOnCreateView;
            for (String str2 : sClassPrefixList) {
                try {
                    viewLayoutInflaterOnCreateView = layoutInflaterOnCreateView(context, str, str2, attributeSet);
                } catch (ClassNotFoundException unused) {
                }
                if (viewLayoutInflaterOnCreateView != null) {
                    return viewLayoutInflaterOnCreateView;
                }
            }
            return null;
        }

        private boolean verifyClassLoader(Context context, Constructor<? extends View> constructor) {
            ClassLoader classLoader = constructor.getDeclaringClass().getClassLoader();
            if (classLoader == BOOT_CLASS_LOADER) {
                return true;
            }
            ClassLoader classLoader2 = context.getClassLoader();
            while (classLoader != classLoader2) {
                classLoader2 = classLoader2.getParent();
                if (classLoader2 == null) {
                    return false;
                }
            }
            return true;
        }

        @Override // android.view.LayoutInflater.Factory
        public View onCreateView(String str, Context context, AttributeSet attributeSet) {
            int styleAttribute;
            try {
                styleAttribute = attributeSet.getStyleAttribute();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "onClick") != null) {
                return createView(str, context, attributeSet);
            }
            if (styleAttribute != 0) {
                int[] iArr = (int[]) Class.forName("com.android.internal.R$styleable").getField("View").get(null);
                int iIntValue = ((Integer) Class.forName("com.android.internal.R$styleable").getField("View_onClick").get(null)).intValue();
                boolean z10 = false;
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
                int i10 = 0;
                while (true) {
                    if (i10 >= typedArrayObtainStyledAttributes.getIndexCount()) {
                        break;
                    }
                    if (typedArrayObtainStyledAttributes.getIndex(i10) == iIntValue) {
                        z10 = true;
                        break;
                    }
                    i10++;
                }
                typedArrayObtainStyledAttributes.recycle();
                if (z10) {
                    return createView(str, context, attributeSet);
                }
            }
            return null;
        }

        private View layoutInflaterOnCreateView(Context context, String str, String str2, AttributeSet attributeSet) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, InstantiationException, SecurityException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
            String str3;
            HashMap<String, Constructor<? extends View>> map = sConstructorMap;
            Constructor<? extends View> constructor = map.get(str);
            Class clsAsSubclass = null;
            if (constructor != null && !verifyClassLoader(context, constructor)) {
                map.remove(str);
                constructor = null;
            }
            if (constructor == null) {
                try {
                    ClassLoader classLoader = context.getClassLoader();
                    if (str2 != null) {
                        str3 = str2 + str;
                    } else {
                        str3 = str;
                    }
                    clsAsSubclass = classLoader.loadClass(str3).asSubclass(View.class);
                    constructor = clsAsSubclass.getConstructor(mConstructorSignature);
                    map.put(str, constructor);
                } catch (ClassCastException e10) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(attributeSet.getPositionDescription());
                    sb2.append(": Class is not a View ");
                    if (str2 != null) {
                        str = str2 + str;
                    }
                    sb2.append(str);
                    InflateException inflateException = new InflateException(sb2.toString());
                    inflateException.initCause(e10);
                    throw inflateException;
                } catch (ClassNotFoundException e11) {
                    throw e11;
                } catch (NoSuchMethodException e12) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(attributeSet.getPositionDescription());
                    sb3.append(": Error inflating class ");
                    if (str2 != null) {
                        str = str2 + str;
                    }
                    sb3.append(str);
                    InflateException inflateException2 = new InflateException(sb3.toString());
                    inflateException2.initCause(e12);
                    throw inflateException2;
                } catch (Exception e13) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(attributeSet.getPositionDescription());
                    sb4.append(": Error inflating class ");
                    sb4.append(clsAsSubclass == null ? CameraInfo.IMPLEMENTATION_TYPE_UNKNOWN : clsAsSubclass.getName());
                    InflateException inflateException3 = new InflateException(sb4.toString());
                    inflateException3.initCause(e13);
                    throw inflateException3;
                }
            }
            Object[] objArr = this.mConstructorArgs;
            objArr[0] = context;
            objArr[1] = attributeSet;
            constructor.setAccessible(true);
            View viewNewInstance = constructor.newInstance(objArr);
            if (viewNewInstance instanceof ViewStub) {
                ((ViewStub) viewNewInstance).setLayoutInflater(LayoutInflater.from((Context) objArr[0]).cloneInContext((Context) objArr[0]));
            }
            Field declaredField = View.class.getDeclaredField("mListenerInfo");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(viewNewInstance);
            viewNewInstance.setOnClickListener(DotOnclickListener.getDotOnclickListener((View.OnClickListener) obj.getClass().getField("mOnClickListener").get(obj)));
            return viewNewInstance;
        }
    }
}
