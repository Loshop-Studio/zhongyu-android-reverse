.class public final Lcom/zykj/study/provide/GlobalObjectProvide;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method static constructor <clinit>()V
    .locals 0

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


# virtual methods
.method public final a(Lo4/k;)Lv3/a;
    .locals 1

    .line 1
    const-string v0, "updateApi"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lcom/zykj/study/provide/GlobalObjectProvide$provideVersionRepository$1;

    .line 7
    .line 8
    invoke-direct {v0, p1}, Lcom/zykj/study/provide/GlobalObjectProvide$provideVersionRepository$1;-><init>(Lo4/k;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method
