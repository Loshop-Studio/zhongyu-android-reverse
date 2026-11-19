.class public final Lcom/friday/common/util/SyncException;
.super Ljava/lang/Exception;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/friday/common/util/SyncException$a;,
        Lcom/friday/common/util/SyncException$Kind;
    }
.end annotation


# static fields
.field public static final e:Lcom/friday/common/util/SyncException$a;

.field public static final f:I


# instance fields
.field public final c:Lcom/friday/common/util/SyncException$Kind;

.field public final d:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/friday/common/util/SyncException$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/friday/common/util/SyncException$a;-><init>(Lkotlin/jvm/internal/n;)V

    sput-object v0, Lcom/friday/common/util/SyncException;->e:Lcom/friday/common/util/SyncException$a;

    const/16 v0, 0x8

    sput v0, Lcom/friday/common/util/SyncException;->f:I

    return-void
.end method

.method public constructor <init>(Lcom/friday/common/util/SyncException$Kind;Ljava/lang/String;)V
    .locals 1

    const-string v0, "kind"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 4
    iput-object p1, p0, Lcom/friday/common/util/SyncException;->c:Lcom/friday/common/util/SyncException$Kind;

    .line 5
    iput-object p2, p0, Lcom/friday/common/util/SyncException;->d:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/friday/common/util/SyncException$Kind;Ljava/lang/String;ILkotlin/jvm/internal/n;)V
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    .line 1
    sget-object p1, Lcom/friday/common/util/SyncException$Kind;->c:Lcom/friday/common/util/SyncException$Kind;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    const/4 p2, 0x0

    .line 2
    :cond_1
    invoke-direct {p0, p1, p2}, Lcom/friday/common/util/SyncException;-><init>(Lcom/friday/common/util/SyncException$Kind;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final a()Lcom/friday/common/util/SyncException$Kind;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/common/util/SyncException;->c:Lcom/friday/common/util/SyncException$Kind;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/friday/common/util/SyncException;->c:Lcom/friday/common/util/SyncException$Kind;

    .line 2
    .line 3
    sget-object v1, Lcom/friday/common/util/SyncException$Kind;->g:Lcom/friday/common/util/SyncException$Kind;

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method public getMessage()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/common/util/SyncException;->d:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
