.class public final Lcom/zykj/huiwei/launcher/app/a$e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/huiwei/launcher/app/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "e"
.end annotation


# instance fields
.field public a:Ly4/a;

.field public b:Lcom/zykj/huiwei/launcher/providers/GlobalObjectProvide;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lr3/i;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/huiwei/launcher/app/a$e;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ly4/a;)Lcom/zykj/huiwei/launcher/app/a$e;
    .locals 0

    .line 1
    invoke-static {p1}, La5/e;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Ly4/a;

    .line 6
    .line 7
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/app/a$e;->a:Ly4/a;

    .line 8
    .line 9
    return-object p0
.end method

.method public b()Lr3/g;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/app/a$e;->a:Ly4/a;

    .line 2
    .line 3
    const-class v1, Ly4/a;

    .line 4
    .line 5
    invoke-static {v0, v1}, La5/e;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/app/a$e;->b:Lcom/zykj/huiwei/launcher/providers/GlobalObjectProvide;

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    new-instance v0, Lcom/zykj/huiwei/launcher/providers/GlobalObjectProvide;

    .line 13
    .line 14
    invoke-direct {v0}, Lcom/zykj/huiwei/launcher/providers/GlobalObjectProvide;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lcom/zykj/huiwei/launcher/app/a$e;->b:Lcom/zykj/huiwei/launcher/providers/GlobalObjectProvide;

    .line 18
    .line 19
    :cond_0
    new-instance v0, Lcom/zykj/huiwei/launcher/app/a$j;

    .line 20
    .line 21
    iget-object v1, p0, Lcom/zykj/huiwei/launcher/app/a$e;->a:Ly4/a;

    .line 22
    .line 23
    iget-object v2, p0, Lcom/zykj/huiwei/launcher/app/a$e;->b:Lcom/zykj/huiwei/launcher/providers/GlobalObjectProvide;

    .line 24
    .line 25
    invoke-direct {v0, v1, v2}, Lcom/zykj/huiwei/launcher/app/a$j;-><init>(Ly4/a;Lcom/zykj/huiwei/launcher/providers/GlobalObjectProvide;)V

    .line 26
    .line 27
    .line 28
    return-object v0
.end method
