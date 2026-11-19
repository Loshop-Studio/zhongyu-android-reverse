.class public final synthetic Lcom/zykj/subscriber/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/t;


# instance fields
.field public final synthetic a:Landroid/content/DialogInterface;

.field public final synthetic b:Lcom/zykj/subscriber/MainActivity;

.field public final synthetic c:Lx2/l;


# direct methods
.method public synthetic constructor <init>(Landroid/content/DialogInterface;Lcom/zykj/subscriber/MainActivity;Lx2/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/subscriber/d;->a:Landroid/content/DialogInterface;

    iput-object p2, p0, Lcom/zykj/subscriber/d;->b:Lcom/zykj/subscriber/MainActivity;

    iput-object p3, p0, Lcom/zykj/subscriber/d;->c:Lx2/l;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, Lcom/zykj/subscriber/d;->a:Landroid/content/DialogInterface;

    iget-object v1, p0, Lcom/zykj/subscriber/d;->b:Lcom/zykj/subscriber/MainActivity;

    iget-object v2, p0, Lcom/zykj/subscriber/d;->c:Lx2/l;

    check-cast p1, Lx0/v;

    invoke-static {v0, v1, v2, p1}, Lcom/zykj/subscriber/MainActivity$d;->j(Landroid/content/DialogInterface;Lcom/zykj/subscriber/MainActivity;Lx2/l;Lx0/v;)V

    return-void
.end method
