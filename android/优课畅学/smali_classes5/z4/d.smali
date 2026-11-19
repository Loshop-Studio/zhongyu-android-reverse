.class public final synthetic Lz4/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Lcom/zykj/study/ui/home/find/search/SearchFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/study/ui/home/find/search/SearchFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz4/d;->a:Lcom/zykj/study/ui/home/find/search/SearchFragment;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lz4/d;->a:Lcom/zykj/study/ui/home/find/search/SearchFragment;

    invoke-static {v0, p1}, Lcom/zykj/study/ui/home/find/search/SearchFragment;->h(Lcom/zykj/study/ui/home/find/search/SearchFragment;Landroid/view/View;)V

    return-void
.end method
