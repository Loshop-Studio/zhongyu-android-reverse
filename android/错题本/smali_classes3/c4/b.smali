.class public final Lc4/b;
.super Lc4/a;
.source "SourceFile"


# instance fields
.field public final d:Lr6/c;

.field public final e:Lr6/c;


# direct methods
.method public constructor <init>(Lr6/c;Lr6/c;)V
    .locals 1

    .line 1
    const-string v0, "serverCallBack"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "userCallBack"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Lc4/a;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lc4/b;->d:Lr6/c;

    .line 15
    .line 16
    iput-object p2, p0, Lc4/b;->e:Lr6/c;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final a(Lcom/zykj/message/server/bean/UserInfo;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc4/b;->e:Lr6/c;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final b(Lcom/zykj/message/server/bean/ServerInfo;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc4/b;->d:Lr6/c;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    return-void
.end method
