.class public final synthetic Ln4/f0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Lcom/zykj/study/adapter/MicroEditAdapter;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/study/adapter/MicroEditAdapter;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln4/f0;->a:Lcom/zykj/study/adapter/MicroEditAdapter;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ln4/f0;->a:Lcom/zykj/study/adapter/MicroEditAdapter;

    invoke-static {v0, p1}, Lcom/zykj/study/adapter/MicroEditAdapter;->c(Lcom/zykj/study/adapter/MicroEditAdapter;Landroid/view/View;)V

    return-void
.end method
