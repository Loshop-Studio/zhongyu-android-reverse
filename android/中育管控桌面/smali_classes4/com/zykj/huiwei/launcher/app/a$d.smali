.class public final Lcom/zykj/huiwei/launcher/app/a$d;
.super Lr3/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/huiwei/launcher/app/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/huiwei/launcher/app/a$d$a;
    }
.end annotation


# instance fields
.field public final a:Lcom/zykj/huiwei/launcher/app/a$j;

.field public final b:Lcom/zykj/huiwei/launcher/app/a$d;

.field public c:La5/f;


# direct methods
.method public constructor <init>(Lcom/zykj/huiwei/launcher/app/a$j;Lx4/h;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lr3/d;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p0, p0, Lcom/zykj/huiwei/launcher/app/a$d;->b:Lcom/zykj/huiwei/launcher/app/a$d;

    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/app/a$d;->a:Lcom/zykj/huiwei/launcher/app/a$j;

    .line 7
    .line 8
    invoke-virtual {p0, p2}, Lcom/zykj/huiwei/launcher/app/a$d;->c(Lx4/h;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public a()Lv4/a;
    .locals 4

    .line 1
    new-instance v0, Lcom/zykj/huiwei/launcher/app/a$a;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/huiwei/launcher/app/a$d;->a:Lcom/zykj/huiwei/launcher/app/a$j;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/zykj/huiwei/launcher/app/a$d;->b:Lcom/zykj/huiwei/launcher/app/a$d;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-direct {v0, v1, v2, v3}, Lcom/zykj/huiwei/launcher/app/a$a;-><init>(Lcom/zykj/huiwei/launcher/app/a$j;Lcom/zykj/huiwei/launcher/app/a$d;Lr3/i;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public b()Lr4/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/app/a$d;->c:La5/f;

    .line 2
    .line 3
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lr4/a;

    .line 8
    .line 9
    return-object v0
.end method

.method public final c(Lx4/h;)V
    .locals 3

    .line 1
    new-instance p1, Lcom/zykj/huiwei/launcher/app/a$d$a;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/app/a$d;->a:Lcom/zykj/huiwei/launcher/app/a$j;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/zykj/huiwei/launcher/app/a$d;->b:Lcom/zykj/huiwei/launcher/app/a$d;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {p1, v0, v1, v2}, Lcom/zykj/huiwei/launcher/app/a$d$a;-><init>(Lcom/zykj/huiwei/launcher/app/a$j;Lcom/zykj/huiwei/launcher/app/a$d;I)V

    .line 9
    .line 10
    .line 11
    invoke-static {p1}, La5/b;->b(La5/f;)La5/f;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/app/a$d;->c:La5/f;

    .line 16
    .line 17
    return-void
.end method
