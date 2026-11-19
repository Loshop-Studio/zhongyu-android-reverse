.class public final Lq8/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq8/e;


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:Lx7/q;

.field public final c:Lx7/q;

.field public final d:Lx7/q;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Lx7/q;Lx7/q;Lx7/q;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lq8/f;->a:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, Lq8/f;->b:Lx7/q;

    .line 7
    .line 8
    iput-object p3, p0, Lq8/f;->c:Lx7/q;

    .line 9
    .line 10
    iput-object p4, p0, Lq8/f;->d:Lx7/q;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public a()Lx7/q;
    .locals 1

    .line 1
    iget-object v0, p0, Lq8/f;->b:Lx7/q;

    .line 2
    .line 3
    return-object v0
.end method

.method public b()Lx7/q;
    .locals 1

    .line 1
    iget-object v0, p0, Lq8/f;->d:Lx7/q;

    .line 2
    .line 3
    return-object v0
.end method

.method public c()Lx7/q;
    .locals 1

    .line 1
    iget-object v0, p0, Lq8/f;->c:Lx7/q;

    .line 2
    .line 3
    return-object v0
.end method

.method public d()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lq8/f;->a:Ljava/lang/Object;

    .line 2
    .line 3
    return-object v0
.end method
