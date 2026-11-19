.class public final synthetic Lc2/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Lcom/zykj/subscriber/FileActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/subscriber/FileActivity;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc2/b;->a:Lcom/zykj/subscriber/FileActivity;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, Lc2/b;->a:Lcom/zykj/subscriber/FileActivity;

    invoke-static {v0, p1}, Lcom/zykj/subscriber/FileActivity;->e(Lcom/zykj/subscriber/FileActivity;Landroid/view/View;)V

    return-void
.end method
