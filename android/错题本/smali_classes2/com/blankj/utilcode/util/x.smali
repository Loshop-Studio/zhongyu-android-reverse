.class public final Lcom/blankj/utilcode/util/x;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:Lcom/blankj/utilcode/util/x;

.field public static c:Ljava/lang/ref/WeakReference;


# instance fields
.field public a:[Landroid/graphics/drawable/Drawable;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/blankj/utilcode/util/x;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x4

    .line 7
    new-array v1, v1, [Landroid/graphics/drawable/Drawable;

    .line 8
    .line 9
    iput-object v1, v0, Lcom/blankj/utilcode/util/x;->a:[Landroid/graphics/drawable/Drawable;

    .line 10
    .line 11
    sput-object v0, Lcom/blankj/utilcode/util/x;->b:Lcom/blankj/utilcode/util/x;

    .line 12
    .line 13
    return-void
.end method

.method public static varargs a(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    array-length v0, p1

    .line 4
    if-lez v0, :cond_0

    .line 5
    .line 6
    :try_start_0
    invoke-static {p0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0
    :try_end_0
    .catch Ljava/util/IllegalFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    goto :goto_0

    .line 11
    :catch_0
    move-exception p1

    .line 12
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 13
    .line 14
    .line 15
    :cond_0
    :goto_0
    if-nez p0, :cond_1

    .line 16
    .line 17
    const-string/jumbo p0, "toast null"

    .line 18
    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    if-nez p1, :cond_2

    .line 26
    .line 27
    const-string/jumbo p0, "toast nothing"

    .line 28
    .line 29
    .line 30
    :cond_2
    :goto_1
    new-instance p1, Lb0/a;

    .line 31
    .line 32
    invoke-direct {p1, p0}, Lb0/a;-><init>(Ljava/lang/CharSequence;)V

    .line 33
    .line 34
    .line 35
    invoke-static {p1}, Lcom/blankj/utilcode/util/c0;->g(Ljava/lang/Runnable;)V

    .line 36
    .line 37
    .line 38
    return-void
.end method
