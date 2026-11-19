.class public final Ll2/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ll2/g;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static b:Z

.field private static c:Ljava/lang/reflect/Field;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ll2/g;

    invoke-direct {v0}, Ll2/g;-><init>()V

    sput-object v0, Ll2/g;->a:Ll2/g;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final b(Landroid/content/res/Resources;)Landroid/util/DisplayMetrics;
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Ll2/g;->c(Landroid/content/res/Resources;)Landroid/util/DisplayMetrics;

    move-result-object v0

    if-nez v0, :cond_0

    .line 2
    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    const-string p1, "resources.displayMetrics"

    invoke-static {v0, p1}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    return-object v0
.end method

.method private final c(Landroid/content/res/Resources;)Landroid/util/DisplayMetrics;
    .locals 5

    .line 1
    sget-boolean v0, Ll2/g;->b:Z

    const-string v1, "null cannot be cast to non-null type android.util.DisplayMetrics"

    const/4 v2, 0x0

    if-nez v0, :cond_4

    .line 2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    const-string v3, "HwResources"

    .line 3
    invoke-static {v3, v0}, Lkotlin/jvm/internal/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v3, 0x1

    if-eqz v0, :cond_3

    .line 4
    :try_start_0
    const-class v0, Landroid/content/res/Resources;

    const-string v4, "mMetrics"

    invoke-virtual {v0, v4}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    sput-object v0, Ll2/g;->c:Ljava/lang/reflect/Field;

    if-nez v0, :cond_0

    goto :goto_0

    .line 5
    :cond_0
    invoke-virtual {v0, v3}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 6
    :goto_0
    sget-object v0, Ll2/g;->c:Ljava/lang/reflect/Field;

    if-nez v0, :cond_1

    move-object p1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v0, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_1
    if-eqz p1, :cond_2

    check-cast p1, Landroid/util/DisplayMetrics;

    move-object v2, p1

    goto :goto_2

    :cond_2
    new-instance p1, Ljava/lang/NullPointerException;

    invoke-direct {p1, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    const-string p1, "AdaptScreenUtils"

    const-string v0, "no field of mTmpMetrics in resources."

    .line 7
    invoke-static {p1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 8
    :cond_3
    :goto_2
    sput-boolean v3, Ll2/g;->b:Z

    return-object v2

    .line 9
    :cond_4
    sget-object v0, Ll2/g;->c:Ljava/lang/reflect/Field;

    if-nez v0, :cond_5

    return-object v2

    :cond_5
    if-nez v0, :cond_6

    move-object p1, v2

    goto :goto_3

    .line 10
    :cond_6
    :try_start_1
    invoke-virtual {v0, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_3
    if-eqz p1, :cond_7

    check-cast p1, Landroid/util/DisplayMetrics;

    move-object v2, p1

    goto :goto_4

    :cond_7
    new-instance p1, Ljava/lang/NullPointerException;

    invoke-direct {p1, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    :goto_4
    return-object v2
.end method

.method private final d(F)V
    .locals 1

    invoke-static {}, Ld2/b;->a()Landroid/app/Application;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Application;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iput p1, v0, Landroid/util/DisplayMetrics;->xdpi:F

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/res/Resources;I)Landroid/content/res/Resources;
    .locals 3
    .param p1    # Landroid/content/res/Resources;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "resources"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p1}, Ll2/g;->b(Landroid/content/res/Resources;)Landroid/util/DisplayMetrics;

    move-result-object v0

    .line 2
    iget v1, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    int-to-float v1, v1

    const/high16 v2, 0x42900000    # 72.0f

    mul-float v1, v1, v2

    int-to-float p2, p2

    div-float/2addr v1, p2

    iput v1, v0, Landroid/util/DisplayMetrics;->xdpi:F

    .line 3
    invoke-direct {p0, v1}, Ll2/g;->d(F)V

    return-object p1
.end method
