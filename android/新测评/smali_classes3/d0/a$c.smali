.class public Ld0/a$c;
.super Ljava/lang/Object;

# interfaces
.implements Ld0/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ld0/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "c"
.end annotation


# instance fields
.field public final synthetic a:Ld0/a;


# direct methods
.method public constructor <init>(Ld0/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ld0/a$c;->a:Ld0/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ld0/a;Ld0/a$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Ld0/a$c;-><init>(Ld0/a;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/alibaba/sdk/android/logger/LogLevel;Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .line 1
    iget-object v0, p0, Ld0/a$c;->a:Ld0/a;

    .line 2
    .line 3
    invoke-static {v0, p1}, Ld0/a;->d(Ld0/a;Lcom/alibaba/sdk/android/logger/LogLevel;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Ld0/a$c;->a:Ld0/a;

    .line 10
    .line 11
    invoke-static {v0}, Ld0/a;->a(Ld0/a;)Ld0/c;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    :try_start_0
    iget-object v0, p0, Ld0/a$c;->a:Ld0/a;

    .line 18
    .line 19
    invoke-static {v0}, Ld0/a;->a(Ld0/a;)Ld0/c;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-interface {v0, p1, p2, p3}, Ld0/c;->a(Lcom/alibaba/sdk/android/logger/LogLevel;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    .line 25
    .line 26
    :catchall_0
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 29
    .line 30
    .line 31
    iget-object v1, p0, Ld0/a$c;->a:Ld0/a;

    .line 32
    .line 33
    invoke-static {v1}, Ld0/a;->e(Ld0/a;)Ljava/util/ArrayList;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    const/4 v2, 0x0

    .line 45
    :catchall_1
    :goto_0
    if-ge v2, v1, :cond_1

    .line 46
    .line 47
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    add-int/lit8 v2, v2, 0x1

    .line 52
    .line 53
    check-cast v3, Ld0/c;

    .line 54
    .line 55
    :try_start_1
    invoke-interface {v3, p1, p2, p3}, Ld0/c;->a(Lcom/alibaba/sdk/android/logger/LogLevel;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_1
    return-void
.end method
