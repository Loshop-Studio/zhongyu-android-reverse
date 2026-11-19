.class public final Lcom/friday/common/util/SyncException$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/friday/common/util/SyncException;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/n;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/friday/common/util/SyncException$a;-><init>()V

    return-void
.end method

.method public static synthetic b(Lcom/friday/common/util/SyncException$a;Ljava/lang/Integer;Ljava/lang/String;ILjava/lang/Object;)Z
    .locals 1

    .line 1
    and-int/lit8 p4, p3, 0x1

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p4, :cond_0

    .line 5
    .line 6
    move-object p1, v0

    .line 7
    :cond_0
    and-int/lit8 p3, p3, 0x2

    .line 8
    .line 9
    if-eqz p3, :cond_1

    .line 10
    .line 11
    move-object p2, v0

    .line 12
    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/friday/common/util/SyncException$a;->a(Ljava/lang/Integer;Ljava/lang/String;)Z

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    return p0
.end method


# virtual methods
.method public final a(Ljava/lang/Integer;Ljava/lang/String;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    goto :goto_0

    .line 5
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    const/16 v1, 0x1f7

    .line 10
    .line 11
    if-eq p1, v1, :cond_2

    .line 12
    .line 13
    :goto_0
    const/4 p1, 0x0

    .line 14
    if-eqz p2, :cond_1

    .line 15
    .line 16
    const/4 v1, 0x2

    .line 17
    const/4 v2, 0x0

    .line 18
    const-string v3, "\u64cd\u4f5c\u592a\u9891\u7e41"

    .line 19
    .line 20
    invoke-static {p2, v3, p1, v1, v2}, Lqd/c0;->U(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    if-ne p2, v0, :cond_1

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_1
    return p1

    .line 28
    :cond_2
    :goto_1
    return v0
.end method

.method public final c(Ljava/lang/Integer;Ljava/lang/String;)Lcom/friday/common/util/SyncException;
    .locals 1

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/friday/common/util/SyncException$a;->a(Ljava/lang/Integer;Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    new-instance p1, Lcom/friday/common/util/SyncException;

    .line 8
    .line 9
    sget-object v0, Lcom/friday/common/util/SyncException$Kind;->g:Lcom/friday/common/util/SyncException$Kind;

    .line 10
    .line 11
    invoke-direct {p1, v0, p2}, Lcom/friday/common/util/SyncException;-><init>(Lcom/friday/common/util/SyncException$Kind;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :cond_0
    new-instance p1, Lcom/friday/common/util/SyncException;

    .line 16
    .line 17
    sget-object v0, Lcom/friday/common/util/SyncException$Kind;->h:Lcom/friday/common/util/SyncException$Kind;

    .line 18
    .line 19
    invoke-direct {p1, v0, p2}, Lcom/friday/common/util/SyncException;-><init>(Lcom/friday/common/util/SyncException$Kind;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    return-object p1
.end method
