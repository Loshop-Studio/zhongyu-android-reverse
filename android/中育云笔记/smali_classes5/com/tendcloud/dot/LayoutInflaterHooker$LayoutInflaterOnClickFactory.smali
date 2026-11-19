.class Lcom/tendcloud/dot/LayoutInflaterHooker$LayoutInflaterOnClickFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/LayoutInflater$Factory;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tendcloud/dot/LayoutInflaterHooker;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "LayoutInflaterOnClickFactory"
.end annotation


# static fields
.field private static final BOOT_CLASS_LOADER:Ljava/lang/ClassLoader;

.field static final mConstructorSignature:[Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field private static final sClassPrefixList:[Ljava/lang/String;

.field private static final sConstructorMap:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/reflect/Constructor<",
            "+",
            "Landroid/view/View;",
            ">;>;"
        }
    .end annotation
.end field


# instance fields
.field final mConstructorArgs:[Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    const-string v0, "android.app."

    .line 2
    .line 3
    const-string v1, "android.view."

    .line 4
    .line 5
    const-string v2, "android.widget."

    .line 6
    .line 7
    const-string v3, "android.webkit."

    .line 8
    .line 9
    filled-new-array {v2, v3, v0, v1}, [Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sput-object v0, Lcom/tendcloud/dot/LayoutInflaterHooker$LayoutInflaterOnClickFactory;->sClassPrefixList:[Ljava/lang/String;

    .line 14
    .line 15
    const-class v0, Landroid/content/Context;

    .line 16
    .line 17
    const-class v1, Landroid/util/AttributeSet;

    .line 18
    .line 19
    filled-new-array {v0, v1}, [Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sput-object v0, Lcom/tendcloud/dot/LayoutInflaterHooker$LayoutInflaterOnClickFactory;->mConstructorSignature:[Ljava/lang/Class;

    .line 24
    .line 25
    new-instance v0, Ljava/util/HashMap;

    .line 26
    .line 27
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 28
    .line 29
    .line 30
    sput-object v0, Lcom/tendcloud/dot/LayoutInflaterHooker$LayoutInflaterOnClickFactory;->sConstructorMap:Ljava/util/HashMap;

    .line 31
    .line 32
    const-class v0, Landroid/view/LayoutInflater;

    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    sput-object v0, Lcom/tendcloud/dot/LayoutInflaterHooker$LayoutInflaterOnClickFactory;->BOOT_CLASS_LOADER:Ljava/lang/ClassLoader;

    .line 39
    .line 40
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x2

    .line 5
    new-array v0, v0, [Ljava/lang/Object;

    .line 6
    .line 7
    iput-object v0, p0, Lcom/tendcloud/dot/LayoutInflaterHooker$LayoutInflaterOnClickFactory;->mConstructorArgs:[Ljava/lang/Object;

    .line 8
    .line 9
    return-void
.end method

.method public static createFactory()Landroid/view/LayoutInflater$Factory;
    .locals 1

    .line 1
    new-instance v0, Lcom/tendcloud/dot/LayoutInflaterHooker$LayoutInflaterOnClickFactory;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/tendcloud/dot/LayoutInflaterHooker$LayoutInflaterOnClickFactory;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method private createView(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 2

    .line 1
    const/16 v0, 0x2e

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/String;->indexOf(I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, -0x1

    .line 8
    if-ne v1, v0, :cond_0

    .line 9
    .line 10
    invoke-direct {p0, p2, p1, p3}, Lcom/tendcloud/dot/LayoutInflaterHooker$LayoutInflaterOnClickFactory;->layoutInflaterOnCreateView(Landroid/content/Context;Ljava/lang/String;Landroid/util/AttributeSet;)Landroid/view/View;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    return-object p1

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    :try_start_0
    invoke-direct {p0, p2, p1, v0, p3}, Lcom/tendcloud/dot/LayoutInflaterHooker$LayoutInflaterOnClickFactory;->layoutInflaterOnCreateView(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/util/AttributeSet;)Landroid/view/View;

    .line 17
    .line 18
    .line 19
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 20
    return-object p1

    .line 21
    :catch_0
    move-exception p1

    .line 22
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 23
    .line 24
    .line 25
    return-object v0
.end method

.method private layoutInflaterOnCreateView(Landroid/content/Context;Ljava/lang/String;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 4

    .line 1
    sget-object v0, Lcom/tendcloud/dot/LayoutInflaterHooker$LayoutInflaterOnClickFactory;->sClassPrefixList:[Ljava/lang/String;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    .line 2
    :try_start_0
    invoke-direct {p0, p1, p2, v3, p3}, Lcom/tendcloud/dot/LayoutInflaterHooker$LayoutInflaterOnClickFactory;->layoutInflaterOnCreateView(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object v3
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v3, :cond_0

    return-object v3

    :catch_0
    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method private layoutInflaterOnCreateView(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 8

    .line 3
    sget-object v0, Lcom/tendcloud/dot/LayoutInflaterHooker$LayoutInflaterOnClickFactory;->sConstructorMap:Ljava/util/HashMap;

    invoke-virtual {v0, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/reflect/Constructor;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    .line 4
    invoke-direct {p0, p1, v1}, Lcom/tendcloud/dot/LayoutInflaterHooker$LayoutInflaterOnClickFactory;->verifyClassLoader(Landroid/content/Context;Ljava/lang/reflect/Constructor;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 5
    invoke-virtual {v0, p2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-object v1, v2

    .line 6
    :cond_0
    const-string v3, ": Error inflating class "

    const-class v4, Landroid/view/View;

    if-nez v1, :cond_2

    .line 7
    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    if-eqz p3, :cond_1

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    :catch_1
    move-exception p1

    goto/16 :goto_3

    :catch_2
    move-exception p1

    goto/16 :goto_4

    :catch_3
    move-exception p1

    goto/16 :goto_5

    :cond_1
    move-object v5, p2

    :goto_0
    invoke-virtual {v1, v5}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    .line 8
    invoke-virtual {v1, v4}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v2

    .line 9
    sget-object v1, Lcom/tendcloud/dot/LayoutInflaterHooker$LayoutInflaterOnClickFactory;->mConstructorSignature:[Ljava/lang/Class;

    invoke-virtual {v2, v1}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v1

    .line 10
    invoke-virtual {v0, p2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    :cond_2
    iget-object v0, p0, Lcom/tendcloud/dot/LayoutInflaterHooker$LayoutInflaterOnClickFactory;->mConstructorArgs:[Ljava/lang/Object;

    const/4 v5, 0x0

    .line 12
    aput-object p1, v0, v5

    const/4 p1, 0x1

    .line 13
    aput-object p4, v0, p1

    .line 14
    invoke-virtual {v1, p1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 15
    invoke-virtual {v1, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    .line 16
    instance-of v6, v1, Landroid/view/ViewStub;

    if-eqz v6, :cond_3

    .line 17
    move-object v6, v1

    check-cast v6, Landroid/view/ViewStub;

    .line 18
    aget-object v7, v0, v5

    check-cast v7, Landroid/content/Context;

    .line 19
    invoke-static {v7}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v7

    aget-object v0, v0, v5

    check-cast v0, Landroid/content/Context;

    invoke-virtual {v7, v0}, Landroid/view/LayoutInflater;->cloneInContext(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    .line 20
    invoke-virtual {v6, v0}, Landroid/view/ViewStub;->setLayoutInflater(Landroid/view/LayoutInflater;)V

    .line 21
    :cond_3
    const-string v0, "mListenerInfo"

    invoke-virtual {v4, v0}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    .line 22
    invoke-virtual {v0, p1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 24
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-string v4, "mOnClickListener"

    .line 25
    invoke-virtual {v0, v4}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/View$OnClickListener;

    .line 26
    invoke-static {p1}, Lcom/tendcloud/dot/DotOnclickListener;->getDotOnclickListener(Landroid/view/View$OnClickListener;)Landroid/view/View$OnClickListener;

    move-result-object p1

    invoke-virtual {v1, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    .line 27
    :goto_1
    new-instance p2, Landroid/view/InflateException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {p4}, Landroid/util/AttributeSet;->getPositionDescription()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-nez v2, :cond_4

    const-string p4, "<unknown>"

    goto :goto_2

    .line 28
    :cond_4
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p4

    :goto_2
    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-direct {p2, p3}, Landroid/view/InflateException;-><init>(Ljava/lang/String;)V

    .line 29
    invoke-virtual {p2, p1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 30
    throw p2

    .line 31
    :goto_3
    throw p1

    .line 32
    :goto_4
    new-instance v0, Landroid/view/InflateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {p4}, Landroid/util/AttributeSet;->getPositionDescription()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {v1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p4, ": Class is not a View "

    invoke-virtual {v1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz p3, :cond_5

    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    :cond_5
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {v0, p2}, Landroid/view/InflateException;-><init>(Ljava/lang/String;)V

    .line 33
    invoke-virtual {v0, p1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 34
    throw v0

    .line 35
    :goto_5
    new-instance v0, Landroid/view/InflateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {p4}, Landroid/util/AttributeSet;->getPositionDescription()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {v1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz p3, :cond_6

    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    :cond_6
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {v0, p2}, Landroid/view/InflateException;-><init>(Ljava/lang/String;)V

    .line 36
    invoke-virtual {v0, p1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 37
    throw v0
.end method

.method private verifyClassLoader(Landroid/content/Context;Ljava/lang/reflect/Constructor;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/reflect/Constructor<",
            "+",
            "Landroid/view/View;",
            ">;)Z"
        }
    .end annotation

    .line 1
    invoke-virtual {p2}, Ljava/lang/reflect/Constructor;->getDeclaringClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-virtual {p2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    sget-object v0, Lcom/tendcloud/dot/LayoutInflaterHooker$LayoutInflaterOnClickFactory;->BOOT_CLASS_LOADER:Ljava/lang/ClassLoader;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    if-ne p2, v0, :cond_0

    .line 13
    .line 14
    return v1

    .line 15
    :cond_0
    invoke-virtual {p1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    :cond_1
    if-ne p2, p1, :cond_2

    .line 20
    .line 21
    return v1

    .line 22
    :cond_2
    invoke-virtual {p1}, Ljava/lang/ClassLoader;->getParent()Ljava/lang/ClassLoader;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    if-nez p1, :cond_1

    .line 27
    .line 28
    const/4 p1, 0x0

    .line 29
    return p1
.end method


# virtual methods
.method public onCreateView(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 6

    .line 1
    const-string v0, "com.android.internal.R$styleable"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    :try_start_0
    invoke-interface {p3}, Landroid/util/AttributeSet;->getStyleAttribute()I

    .line 5
    .line 6
    .line 7
    move-result v2

    .line 8
    const-string v3, "http://schemas.android.com/apk/res/android"

    .line 9
    .line 10
    const-string v4, "onClick"

    .line 11
    .line 12
    invoke-interface {p3, v3, v4}, Landroid/util/AttributeSet;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    if-eqz v3, :cond_0

    .line 17
    .line 18
    invoke-direct {p0, p1, p2, p3}, Lcom/tendcloud/dot/LayoutInflaterHooker$LayoutInflaterOnClickFactory;->createView(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1

    .line 23
    :catch_0
    move-exception p1

    .line 24
    goto :goto_2

    .line 25
    :cond_0
    if-eqz v2, :cond_3

    .line 26
    .line 27
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    const-string v3, "View"

    .line 32
    .line 33
    invoke-virtual {v2, v3}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-virtual {v2, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    check-cast v2, [I

    .line 42
    .line 43
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    const-string v3, "View_onClick"

    .line 48
    .line 49
    invoke-virtual {v0, v3}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    check-cast v0, Ljava/lang/Integer;

    .line 58
    .line 59
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    const/4 v3, 0x0

    .line 64
    invoke-virtual {p2, p3, v2, v3, v3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    move v4, v3

    .line 69
    :goto_0
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->getIndexCount()I

    .line 70
    .line 71
    .line 72
    move-result v5

    .line 73
    if-ge v4, v5, :cond_2

    .line 74
    .line 75
    invoke-virtual {v2, v4}, Landroid/content/res/TypedArray;->getIndex(I)I

    .line 76
    .line 77
    .line 78
    move-result v5

    .line 79
    if-ne v5, v0, :cond_1

    .line 80
    .line 81
    const/4 v3, 0x1

    .line 82
    goto :goto_1

    .line 83
    :cond_1
    add-int/lit8 v4, v4, 0x1

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_2
    :goto_1
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    .line 87
    .line 88
    .line 89
    if-eqz v3, :cond_3

    .line 90
    .line 91
    invoke-direct {p0, p1, p2, p3}, Lcom/tendcloud/dot/LayoutInflaterHooker$LayoutInflaterOnClickFactory;->createView(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    .line 92
    .line 93
    .line 94
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 95
    return-object p1

    .line 96
    :goto_2
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 97
    .line 98
    .line 99
    :cond_3
    return-object v1
.end method
