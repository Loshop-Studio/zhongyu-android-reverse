.class public final Ls3/d$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls3/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final synthetic a:Ls3/d$a;

.field public static final b:Lkotlin/Lazy;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ls3/d$a;

    .line 2
    .line 3
    invoke-direct {v0}, Ls3/d$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ls3/d$a;->a:Ls3/d$a;

    .line 7
    .line 8
    new-instance v0, Ls3/a;

    .line 9
    .line 10
    invoke-direct {v0}, Ls3/a;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sput-object v0, Ls3/d$a;->b:Lkotlin/Lazy;

    .line 18
    .line 19
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic a()Landroidx/navigation/NavOptions;
    .locals 1

    .line 1
    invoke-static {}, Ls3/d$a;->e()Landroidx/navigation/NavOptions;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic b(Landroidx/navigation/NavOptionsBuilder;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0}, Ls3/d$a;->f(Landroidx/navigation/NavOptionsBuilder;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroidx/navigation/AnimBuilder;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0}, Ls3/d$a;->g(Landroidx/navigation/AnimBuilder;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final e()Landroidx/navigation/NavOptions;
    .locals 1

    .line 1
    new-instance v0, Ls3/b;

    .line 2
    .line 3
    invoke-direct {v0}, Ls3/b;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Landroidx/navigation/NavOptionsBuilderKt;->navOptions(Lkotlin/jvm/functions/Function1;)Landroidx/navigation/NavOptions;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0
.end method

.method public static final f(Landroidx/navigation/NavOptionsBuilder;)Lkotlin/Unit;
    .locals 1

    .line 1
    const-string v0, "$this$navOptions"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ls3/c;

    .line 7
    .line 8
    invoke-direct {v0}, Ls3/c;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v0}, Landroidx/navigation/NavOptionsBuilder;->anim(Lkotlin/jvm/functions/Function1;)V

    .line 12
    .line 13
    .line 14
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 15
    .line 16
    return-object p0
.end method

.method public static final g(Landroidx/navigation/AnimBuilder;)Lkotlin/Unit;
    .locals 1

    .line 1
    const-string v0, "$this$anim"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const v0, 0x7f010056

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, v0}, Landroidx/navigation/AnimBuilder;->setEnter(I)V

    .line 10
    .line 11
    .line 12
    const v0, 0x7f010057

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, v0}, Landroidx/navigation/AnimBuilder;->setExit(I)V

    .line 16
    .line 17
    .line 18
    const v0, 0x7f010055

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, v0}, Landroidx/navigation/AnimBuilder;->setPopEnter(I)V

    .line 22
    .line 23
    .line 24
    const v0, 0x7f010058

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, v0}, Landroidx/navigation/AnimBuilder;->setPopExit(I)V

    .line 28
    .line 29
    .line 30
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 31
    .line 32
    return-object p0
.end method


# virtual methods
.method public final d()Landroidx/navigation/NavOptions;
    .locals 1

    .line 1
    sget-object v0, Ls3/d$a;->b:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroidx/navigation/NavOptions;

    .line 8
    .line 9
    return-object v0
.end method
