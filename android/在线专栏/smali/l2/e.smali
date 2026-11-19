.class public final Ll2/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ll2/e;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final b:Li3/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Li3/e<",
            "Lo2/r;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final c:Li3/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Li3/h<",
            "Lo2/r;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Ll2/e;

    invoke-direct {v0}, Ll2/e;-><init>()V

    sput-object v0, Ll2/e;->a:Ll2/e;

    .line 1
    sget-object v0, Lh3/a;->b:Lh3/a;

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    .line 2
    invoke-static {v1, v2, v0, v2, v3}, Li3/j;->b(IILh3/a;ILjava/lang/Object;)Li3/e;

    move-result-object v0

    sput-object v0, Ll2/e;->b:Li3/e;

    .line 3
    invoke-static {v0}, Li3/c;->a(Li3/e;)Li3/h;

    move-result-object v0

    sput-object v0, Ll2/e;->c:Li3/h;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic a()Li3/e;
    .locals 1

    sget-object v0, Ll2/e;->b:Li3/e;

    return-object v0
.end method


# virtual methods
.method public final b()V
    .locals 3

    new-instance v0, Ll2/e$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ll2/e$a;-><init>(Lq2/d;)V

    const/4 v2, 0x1

    invoke-static {v1, v0, v2, v1}, Lf3/g;->f(Lq2/g;Lx2/p;ILjava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final c()Li3/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Li3/h<",
            "Lo2/r;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    sget-object v0, Ll2/e;->c:Li3/h;

    return-object v0
.end method
