.class public Lorg/apache/commons/net/ProtocolCommandSupport;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field public final c:Ljava/lang/Object;

.field public final d:Lorg/apache/commons/net/util/ListenerList;


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lorg/apache/commons/net/util/ListenerList;

    .line 5
    .line 6
    invoke-direct {v0}, Lorg/apache/commons/net/util/ListenerList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lorg/apache/commons/net/ProtocolCommandSupport;->d:Lorg/apache/commons/net/util/ListenerList;

    .line 10
    .line 11
    iput-object p1, p0, Lorg/apache/commons/net/ProtocolCommandSupport;->c:Ljava/lang/Object;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Lorg/apache/commons/net/ProtocolCommandEvent;

    .line 2
    .line 3
    iget-object v1, p0, Lorg/apache/commons/net/ProtocolCommandSupport;->c:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {v0, v1, p1, p2}, Lorg/apache/commons/net/ProtocolCommandEvent;-><init>(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, Lorg/apache/commons/net/ProtocolCommandSupport;->d:Lorg/apache/commons/net/util/ListenerList;

    .line 9
    .line 10
    invoke-virtual {p1}, Lorg/apache/commons/net/util/ListenerList;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result p2

    .line 18
    if-nez p2, :cond_0

    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    check-cast p1, Ljava/util/EventListener;

    .line 26
    .line 27
    invoke-static {p1}, Lk/r;->a(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    const/4 p1, 0x0

    .line 31
    throw p1
.end method

.method public c(ILjava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Lorg/apache/commons/net/ProtocolCommandEvent;

    .line 2
    .line 3
    iget-object v1, p0, Lorg/apache/commons/net/ProtocolCommandSupport;->c:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {v0, v1, p1, p2}, Lorg/apache/commons/net/ProtocolCommandEvent;-><init>(Ljava/lang/Object;ILjava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, Lorg/apache/commons/net/ProtocolCommandSupport;->d:Lorg/apache/commons/net/util/ListenerList;

    .line 9
    .line 10
    invoke-virtual {p1}, Lorg/apache/commons/net/util/ListenerList;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result p2

    .line 18
    if-nez p2, :cond_0

    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    check-cast p1, Ljava/util/EventListener;

    .line 26
    .line 27
    invoke-static {p1}, Lk/r;->a(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    const/4 p1, 0x0

    .line 31
    throw p1
.end method

.method public d()I
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/commons/net/ProtocolCommandSupport;->d:Lorg/apache/commons/net/util/ListenerList;

    .line 2
    .line 3
    invoke-virtual {v0}, Lorg/apache/commons/net/util/ListenerList;->c()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method
