.class public final synthetic Lcom/zykj/subscriber/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnShowListener;


# instance fields
.field public final synthetic a:Lx0/w;

.field public final synthetic b:Lx0/p;

.field public final synthetic c:Lcom/zykj/subscriber/MainActivity;

.field public final synthetic d:Lx2/l;


# direct methods
.method public synthetic constructor <init>(Lx0/w;Lx0/p;Lcom/zykj/subscriber/MainActivity;Lx2/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/subscriber/c;->a:Lx0/w;

    iput-object p2, p0, Lcom/zykj/subscriber/c;->b:Lx0/p;

    iput-object p3, p0, Lcom/zykj/subscriber/c;->c:Lcom/zykj/subscriber/MainActivity;

    iput-object p4, p0, Lcom/zykj/subscriber/c;->d:Lx2/l;

    return-void
.end method


# virtual methods
.method public final onShow(Landroid/content/DialogInterface;)V
    .locals 4

    iget-object v0, p0, Lcom/zykj/subscriber/c;->a:Lx0/w;

    iget-object v1, p0, Lcom/zykj/subscriber/c;->b:Lx0/p;

    iget-object v2, p0, Lcom/zykj/subscriber/c;->c:Lcom/zykj/subscriber/MainActivity;

    iget-object v3, p0, Lcom/zykj/subscriber/c;->d:Lx2/l;

    invoke-static {v0, v1, v2, v3, p1}, Lcom/zykj/subscriber/MainActivity$d;->e(Lx0/w;Lx0/p;Lcom/zykj/subscriber/MainActivity;Lx2/l;Landroid/content/DialogInterface;)V

    return-void
.end method
