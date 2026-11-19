.class public final Lcom/zykj/huiwei/launcher/app/a$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv4/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/huiwei/launcher/app/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "h"
.end annotation


# instance fields
.field public final a:Lcom/zykj/huiwei/launcher/app/a$j;

.field public b:Landroid/app/Service;


# direct methods
.method public constructor <init>(Lcom/zykj/huiwei/launcher/app/a$j;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/app/a$h;->a:Lcom/zykj/huiwei/launcher/app/a$j;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/zykj/huiwei/launcher/app/a$j;Lr3/i;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/huiwei/launcher/app/a$h;-><init>(Lcom/zykj/huiwei/launcher/app/a$j;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Landroid/app/Service;)Lv4/d;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/huiwei/launcher/app/a$h;->c(Landroid/app/Service;)Lcom/zykj/huiwei/launcher/app/a$h;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public b()Lr3/f;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/app/a$h;->b:Landroid/app/Service;

    .line 2
    .line 3
    const-class v1, Landroid/app/Service;

    .line 4
    .line 5
    invoke-static {v0, v1}, La5/e;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    .line 6
    .line 7
    .line 8
    new-instance v0, Lcom/zykj/huiwei/launcher/app/a$i;

    .line 9
    .line 10
    iget-object v1, p0, Lcom/zykj/huiwei/launcher/app/a$h;->a:Lcom/zykj/huiwei/launcher/app/a$j;

    .line 11
    .line 12
    iget-object v2, p0, Lcom/zykj/huiwei/launcher/app/a$h;->b:Landroid/app/Service;

    .line 13
    .line 14
    invoke-direct {v0, v1, v2}, Lcom/zykj/huiwei/launcher/app/a$i;-><init>(Lcom/zykj/huiwei/launcher/app/a$j;Landroid/app/Service;)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method

.method public bridge synthetic build()Ls4/d;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/app/a$h;->b()Lr3/f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public c(Landroid/app/Service;)Lcom/zykj/huiwei/launcher/app/a$h;
    .locals 0

    .line 1
    invoke-static {p1}, La5/e;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Landroid/app/Service;

    .line 6
    .line 7
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/app/a$h;->b:Landroid/app/Service;

    .line 8
    .line 9
    return-object p0
.end method
