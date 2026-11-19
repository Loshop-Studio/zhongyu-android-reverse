.class public final Lf3/v0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lf3/v0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final b:Lf3/e0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final c:Lf3/e0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final d:Lf3/e0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lf3/v0;

    invoke-direct {v0}, Lf3/v0;-><init>()V

    sput-object v0, Lf3/v0;->a:Lf3/v0;

    .line 1
    invoke-static {}, Lf3/d0;->a()Lf3/e0;

    move-result-object v0

    sput-object v0, Lf3/v0;->b:Lf3/e0;

    .line 2
    sget-object v0, Lf3/j2;->b:Lf3/j2;

    sput-object v0, Lf3/v0;->c:Lf3/e0;

    .line 3
    sget-object v0, Lkotlinx/coroutines/scheduling/b;->h:Lkotlinx/coroutines/scheduling/b;

    invoke-virtual {v0}, Lkotlinx/coroutines/scheduling/b;->N()Lf3/e0;

    move-result-object v0

    sput-object v0, Lf3/v0;->d:Lf3/e0;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final a()Lf3/e0;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    sget-object v0, Lf3/v0;->b:Lf3/e0;

    return-object v0
.end method

.method public static final b()Lf3/e0;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    sget-object v0, Lf3/v0;->d:Lf3/e0;

    return-object v0
.end method

.method public static final c()Lf3/x1;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    sget-object v0, Lkotlinx/coroutines/internal/n;->c:Lf3/x1;

    return-object v0
.end method
