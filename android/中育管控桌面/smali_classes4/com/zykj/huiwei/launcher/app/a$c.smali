.class public final Lcom/zykj/huiwei/launcher/app/a$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv4/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/huiwei/launcher/app/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field public final a:Lcom/zykj/huiwei/launcher/app/a$j;

.field public b:Lx4/h;


# direct methods
.method public constructor <init>(Lcom/zykj/huiwei/launcher/app/a$j;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/app/a$c;->a:Lcom/zykj/huiwei/launcher/app/a$j;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/zykj/huiwei/launcher/app/a$j;Lr3/i;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/huiwei/launcher/app/a$c;-><init>(Lcom/zykj/huiwei/launcher/app/a$j;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lx4/h;)Lv4/b;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/huiwei/launcher/app/a$c;->c(Lx4/h;)Lcom/zykj/huiwei/launcher/app/a$c;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public b()Lr3/d;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/app/a$c;->b:Lx4/h;

    .line 2
    .line 3
    const-class v1, Lx4/h;

    .line 4
    .line 5
    invoke-static {v0, v1}, La5/e;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    .line 6
    .line 7
    .line 8
    new-instance v0, Lcom/zykj/huiwei/launcher/app/a$d;

    .line 9
    .line 10
    iget-object v1, p0, Lcom/zykj/huiwei/launcher/app/a$c;->a:Lcom/zykj/huiwei/launcher/app/a$j;

    .line 11
    .line 12
    iget-object v2, p0, Lcom/zykj/huiwei/launcher/app/a$c;->b:Lx4/h;

    .line 13
    .line 14
    invoke-direct {v0, v1, v2}, Lcom/zykj/huiwei/launcher/app/a$d;-><init>(Lcom/zykj/huiwei/launcher/app/a$j;Lx4/h;)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method

.method public bridge synthetic build()Ls4/b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/app/a$c;->b()Lr3/d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public c(Lx4/h;)Lcom/zykj/huiwei/launcher/app/a$c;
    .locals 0

    .line 1
    invoke-static {p1}, La5/e;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lx4/h;

    .line 6
    .line 7
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/app/a$c;->b:Lx4/h;

    .line 8
    .line 9
    return-object p0
.end method
