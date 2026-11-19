.class public final Lcom/zykj/study/provide/GlobalObjectProvide$provideVersionRepository$1;
.super Lv3/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/study/provide/GlobalObjectProvide;->a(Lo4/k;)Lv3/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lo4/k;


# direct methods
.method public constructor <init>(Lo4/k;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/provide/GlobalObjectProvide$provideVersionRepository$1;->a:Lo4/k;

    .line 2
    .line 3
    invoke-direct {p0}, Lv3/a;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;ILcom/zykj/lib/ota/bean/AppType;Lm7/c;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p4, Lcom/zykj/study/provide/GlobalObjectProvide$provideVersionRepository$1$getLastVersionInfo$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p4

    .line 6
    check-cast v0, Lcom/zykj/study/provide/GlobalObjectProvide$provideVersionRepository$1$getLastVersionInfo$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/zykj/study/provide/GlobalObjectProvide$provideVersionRepository$1$getLastVersionInfo$1;->f:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lcom/zykj/study/provide/GlobalObjectProvide$provideVersionRepository$1$getLastVersionInfo$1;->f:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/zykj/study/provide/GlobalObjectProvide$provideVersionRepository$1$getLastVersionInfo$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p4}, Lcom/zykj/study/provide/GlobalObjectProvide$provideVersionRepository$1$getLastVersionInfo$1;-><init>(Lcom/zykj/study/provide/GlobalObjectProvide$provideVersionRepository$1;Lm7/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p4, v0, Lcom/zykj/study/provide/GlobalObjectProvide$provideVersionRepository$1$getLastVersionInfo$1;->d:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/zykj/study/provide/GlobalObjectProvide$provideVersionRepository$1$getLastVersionInfo$1;->f:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v3, :cond_1

    .line 37
    .line 38
    iget-object p1, v0, Lcom/zykj/study/provide/GlobalObjectProvide$provideVersionRepository$1$getLastVersionInfo$1;->b:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p1, Lcom/zykj/lib/ota/bean/AppType;

    .line 41
    .line 42
    iget-object p1, v0, Lcom/zykj/study/provide/GlobalObjectProvide$provideVersionRepository$1$getLastVersionInfo$1;->a:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast p1, Ljava/lang/String;

    .line 45
    .line 46
    invoke-static {p4}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 51
    .line 52
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 53
    .line 54
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    throw p1

    .line 58
    :cond_2
    invoke-static {p4}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    iget-object p4, p0, Lcom/zykj/study/provide/GlobalObjectProvide$provideVersionRepository$1;->a:Lo4/k;

    .line 62
    .line 63
    sget-object v2, Lcom/zykj/lib/ota/bean/AppType;->TEACHER:Lcom/zykj/lib/ota/bean/AppType;

    .line 64
    .line 65
    if-ne p3, v2, :cond_3

    .line 66
    .line 67
    move v2, v3

    .line 68
    goto :goto_1

    .line 69
    :cond_3
    const/4 v2, 0x0

    .line 70
    :goto_1
    invoke-static {p1}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    iput-object v4, v0, Lcom/zykj/study/provide/GlobalObjectProvide$provideVersionRepository$1$getLastVersionInfo$1;->a:Ljava/lang/Object;

    .line 75
    .line 76
    invoke-static {p3}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p3

    .line 80
    iput-object p3, v0, Lcom/zykj/study/provide/GlobalObjectProvide$provideVersionRepository$1$getLastVersionInfo$1;->b:Ljava/lang/Object;

    .line 81
    .line 82
    iput p2, v0, Lcom/zykj/study/provide/GlobalObjectProvide$provideVersionRepository$1$getLastVersionInfo$1;->c:I

    .line 83
    .line 84
    iput v3, v0, Lcom/zykj/study/provide/GlobalObjectProvide$provideVersionRepository$1$getLastVersionInfo$1;->f:I

    .line 85
    .line 86
    invoke-interface {p4, p1, p2, v2, v0}, Lo4/k;->a(Ljava/lang/String;IILm7/c;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p4

    .line 90
    if-ne p4, v1, :cond_4

    .line 91
    .line 92
    return-object v1

    .line 93
    :cond_4
    :goto_2
    check-cast p4, Lcom/zykj/lib/ota/bean/VersionInfo;

    .line 94
    .line 95
    return-object p4
.end method
