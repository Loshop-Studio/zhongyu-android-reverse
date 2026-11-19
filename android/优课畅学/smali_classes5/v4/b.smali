.class public final synthetic Lv4/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# instance fields
.field public final synthetic a:Lcom/zykj/study/ui/home/HomeFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/study/ui/home/HomeFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv4/b;->a:Lcom/zykj/study/ui/home/HomeFragment;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lv4/b;->a:Lcom/zykj/study/ui/home/HomeFragment;

    check-cast p1, Landroidx/activity/OnBackPressedCallback;

    invoke-static {v0, p1}, Lcom/zykj/study/ui/home/HomeFragment;->h(Lcom/zykj/study/ui/home/HomeFragment;Landroidx/activity/OnBackPressedCallback;)Lh7/p;

    move-result-object p1

    return-object p1
.end method
