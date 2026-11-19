package androidx.window.layout;

import androidx.annotation.RequiresApi;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.layout.WindowLayoutComponent;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlin.AbstractC9078a;
import kotlin.jvm.internal.AbstractC9133u;
import p089e8.InterfaceC8375c;
import p123h7.InterfaceC8724d;
import p289w7.AbstractC10360a;
import p300x7.InterfaceC10559a;

/* loaded from: classes3.dex */
public final class SafeWindowLayoutComponentProvider {
    public static final SafeWindowLayoutComponentProvider INSTANCE = new SafeWindowLayoutComponentProvider();
    private static final InterfaceC8724d windowLayoutComponent$delegate = AbstractC9078a.m15924b(new InterfaceC10559a() { // from class: androidx.window.layout.SafeWindowLayoutComponentProvider$windowLayoutComponent$2
        @Override // p300x7.InterfaceC10559a
        public final WindowLayoutComponent invoke() {
            ClassLoader classLoader = SafeWindowLayoutComponentProvider.class.getClassLoader();
            if (classLoader == null || !SafeWindowLayoutComponentProvider.INSTANCE.canUseWindowLayoutComponent(classLoader)) {
                return null;
            }
            try {
                return WindowExtensionsProvider.getWindowExtensions().getWindowLayoutComponent();
            } catch (UnsupportedOperationException unused) {
                return null;
            }
        }
    });

    private SafeWindowLayoutComponentProvider() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean canUseWindowLayoutComponent(ClassLoader classLoader) {
        return isWindowLayoutProviderValid(classLoader) && isWindowExtensionsValid(classLoader) && isWindowLayoutComponentValid(classLoader) && isFoldingFeatureValid(classLoader);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean doesReturn(Method method, InterfaceC8375c interfaceC8375c) {
        return doesReturn(method, AbstractC10360a.m19298a(interfaceC8375c));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Class<?> foldingFeatureClass(ClassLoader classLoader) {
        return classLoader.loadClass("androidx.window.extensions.layout.FoldingFeature");
    }

    private final boolean isFoldingFeatureValid(final ClassLoader classLoader) {
        return validate(new InterfaceC10559a() { // from class: androidx.window.layout.SafeWindowLayoutComponentProvider.isFoldingFeatureValid.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0060  */
            @Override // p300x7.InterfaceC10559a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Boolean invoke() throws java.lang.NoSuchMethodException, java.lang.SecurityException {
                /*
                    r6 = this;
                    androidx.window.layout.SafeWindowLayoutComponentProvider r0 = androidx.window.layout.SafeWindowLayoutComponentProvider.INSTANCE
                    java.lang.ClassLoader r1 = r1
                    java.lang.Class r1 = androidx.window.layout.SafeWindowLayoutComponentProvider.access$foldingFeatureClass(r0, r1)
                    java.lang.String r2 = "getBounds"
                    r3 = 0
                    java.lang.reflect.Method r2 = r1.getMethod(r2, r3)
                    java.lang.String r4 = "getType"
                    java.lang.reflect.Method r4 = r1.getMethod(r4, r3)
                    java.lang.String r5 = "getState"
                    java.lang.reflect.Method r1 = r1.getMethod(r5, r3)
                    java.lang.String r3 = "getBoundsMethod"
                    kotlin.jvm.internal.AbstractC9133u.m16132f(r2, r3)
                    java.lang.Class<android.graphics.Rect> r3 = android.graphics.Rect.class
                    e8.c r3 = kotlin.jvm.internal.AbstractC9137y.m16154b(r3)
                    boolean r3 = androidx.window.layout.SafeWindowLayoutComponentProvider.access$doesReturn(r0, r2, r3)
                    if (r3 == 0) goto L60
                    boolean r2 = androidx.window.layout.SafeWindowLayoutComponentProvider.access$isPublic(r0, r2)
                    if (r2 == 0) goto L60
                    java.lang.String r2 = "getTypeMethod"
                    kotlin.jvm.internal.AbstractC9133u.m16132f(r4, r2)
                    java.lang.Class r2 = java.lang.Integer.TYPE
                    e8.c r3 = kotlin.jvm.internal.AbstractC9137y.m16154b(r2)
                    boolean r3 = androidx.window.layout.SafeWindowLayoutComponentProvider.access$doesReturn(r0, r4, r3)
                    if (r3 == 0) goto L60
                    boolean r3 = androidx.window.layout.SafeWindowLayoutComponentProvider.access$isPublic(r0, r4)
                    if (r3 == 0) goto L60
                    java.lang.String r3 = "getStateMethod"
                    kotlin.jvm.internal.AbstractC9133u.m16132f(r1, r3)
                    e8.c r2 = kotlin.jvm.internal.AbstractC9137y.m16154b(r2)
                    boolean r2 = androidx.window.layout.SafeWindowLayoutComponentProvider.access$doesReturn(r0, r1, r2)
                    if (r2 == 0) goto L60
                    boolean r0 = androidx.window.layout.SafeWindowLayoutComponentProvider.access$isPublic(r0, r1)
                    if (r0 == 0) goto L60
                    r0 = 1
                    goto L61
                L60:
                    r0 = 0
                L61:
                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.window.layout.SafeWindowLayoutComponentProvider.C47971.invoke():java.lang.Boolean");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isPublic(Method method) {
        return Modifier.isPublic(method.getModifiers());
    }

    private final boolean isWindowExtensionsValid(final ClassLoader classLoader) {
        return validate(new InterfaceC10559a() { // from class: androidx.window.layout.SafeWindowLayoutComponentProvider.isWindowExtensionsValid.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x002d  */
            @Override // p300x7.InterfaceC10559a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Boolean invoke() throws java.lang.NoSuchMethodException, java.lang.SecurityException {
                /*
                    r4 = this;
                    androidx.window.layout.SafeWindowLayoutComponentProvider r0 = androidx.window.layout.SafeWindowLayoutComponentProvider.INSTANCE
                    java.lang.ClassLoader r1 = r1
                    java.lang.Class r1 = androidx.window.layout.SafeWindowLayoutComponentProvider.access$windowExtensionsClass(r0, r1)
                    java.lang.String r2 = "getWindowLayoutComponent"
                    r3 = 0
                    java.lang.reflect.Method r1 = r1.getMethod(r2, r3)
                    java.lang.ClassLoader r2 = r1
                    java.lang.Class r2 = androidx.window.layout.SafeWindowLayoutComponentProvider.access$windowLayoutComponentClass(r0, r2)
                    java.lang.String r3 = "getWindowLayoutComponentMethod"
                    kotlin.jvm.internal.AbstractC9133u.m16132f(r1, r3)
                    boolean r3 = androidx.window.layout.SafeWindowLayoutComponentProvider.access$isPublic(r0, r1)
                    if (r3 == 0) goto L2d
                    java.lang.String r3 = "windowLayoutComponentClass"
                    kotlin.jvm.internal.AbstractC9133u.m16132f(r2, r3)
                    boolean r0 = androidx.window.layout.SafeWindowLayoutComponentProvider.access$doesReturn(r0, r1, r2)
                    if (r0 == 0) goto L2d
                    r0 = 1
                    goto L2e
                L2d:
                    r0 = 0
                L2e:
                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.window.layout.SafeWindowLayoutComponentProvider.C47981.invoke():java.lang.Boolean");
            }
        });
    }

    @RequiresApi(24)
    private final boolean isWindowLayoutComponentValid(final ClassLoader classLoader) {
        return validate(new InterfaceC10559a() { // from class: androidx.window.layout.SafeWindowLayoutComponentProvider.isWindowLayoutComponentValid.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0038  */
            @Override // p300x7.InterfaceC10559a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Boolean invoke() throws java.lang.NoSuchMethodException, java.lang.SecurityException {
                /*
                    r5 = this;
                    androidx.window.layout.SafeWindowLayoutComponentProvider r0 = androidx.window.layout.SafeWindowLayoutComponentProvider.INSTANCE
                    java.lang.ClassLoader r1 = r1
                    java.lang.Class r1 = androidx.window.layout.SafeWindowLayoutComponentProvider.access$windowLayoutComponentClass(r0, r1)
                    java.lang.Class<android.app.Activity> r2 = android.app.Activity.class
                    java.lang.Class<java.util.function.Consumer> r3 = java.util.function.Consumer.class
                    java.lang.Class[] r2 = new java.lang.Class[]{r2, r3}
                    java.lang.String r4 = "addWindowLayoutInfoListener"
                    java.lang.reflect.Method r2 = r1.getMethod(r4, r2)
                    java.lang.String r4 = "removeWindowLayoutInfoListener"
                    java.lang.Class[] r3 = new java.lang.Class[]{r3}
                    java.lang.reflect.Method r1 = r1.getMethod(r4, r3)
                    java.lang.String r3 = "addListenerMethod"
                    kotlin.jvm.internal.AbstractC9133u.m16132f(r2, r3)
                    boolean r2 = androidx.window.layout.SafeWindowLayoutComponentProvider.access$isPublic(r0, r2)
                    if (r2 == 0) goto L38
                    java.lang.String r2 = "removeListenerMethod"
                    kotlin.jvm.internal.AbstractC9133u.m16132f(r1, r2)
                    boolean r0 = androidx.window.layout.SafeWindowLayoutComponentProvider.access$isPublic(r0, r1)
                    if (r0 == 0) goto L38
                    r0 = 1
                    goto L39
                L38:
                    r0 = 0
                L39:
                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.window.layout.SafeWindowLayoutComponentProvider.C47991.invoke():java.lang.Boolean");
            }
        });
    }

    private final boolean isWindowLayoutProviderValid(final ClassLoader classLoader) {
        return validate(new InterfaceC10559a() { // from class: androidx.window.layout.SafeWindowLayoutComponentProvider.isWindowLayoutProviderValid.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final Boolean invoke() throws NoSuchMethodException, SecurityException {
                SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider = SafeWindowLayoutComponentProvider.INSTANCE;
                Method getWindowExtensionsMethod = safeWindowLayoutComponentProvider.windowExtensionsProviderClass(classLoader).getDeclaredMethod("getWindowExtensions", null);
                Class windowExtensionsClass = safeWindowLayoutComponentProvider.windowExtensionsClass(classLoader);
                AbstractC9133u.m16132f(getWindowExtensionsMethod, "getWindowExtensionsMethod");
                AbstractC9133u.m16132f(windowExtensionsClass, "windowExtensionsClass");
                return Boolean.valueOf(safeWindowLayoutComponentProvider.doesReturn(getWindowExtensionsMethod, (Class<?>) windowExtensionsClass) && safeWindowLayoutComponentProvider.isPublic(getWindowExtensionsMethod));
            }
        });
    }

    private final boolean validate(InterfaceC10559a interfaceC10559a) {
        try {
            return ((Boolean) interfaceC10559a.invoke()).booleanValue();
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Class<?> windowExtensionsClass(ClassLoader classLoader) {
        return classLoader.loadClass("androidx.window.extensions.WindowExtensions");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Class<?> windowExtensionsProviderClass(ClassLoader classLoader) {
        return classLoader.loadClass("androidx.window.extensions.WindowExtensionsProvider");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Class<?> windowLayoutComponentClass(ClassLoader classLoader) {
        return classLoader.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
    }

    public final WindowLayoutComponent getWindowLayoutComponent() {
        return (WindowLayoutComponent) windowLayoutComponent$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean doesReturn(Method method, Class<?> cls) {
        return method.getReturnType().equals(cls);
    }
}
