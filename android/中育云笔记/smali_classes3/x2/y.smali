.class public final synthetic Lx2/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/material/tabs/TabLayoutMediator$TabConfigurationStrategy;


# instance fields
.field public final synthetic a:Lcom/friday/document/view/share/StudentShareFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/friday/document/view/share/StudentShareFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx2/y;->a:Lcom/friday/document/view/share/StudentShareFragment;

    return-void
.end method


# virtual methods
.method public final onConfigureTab(Lcom/google/android/material/tabs/TabLayout$Tab;I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lx2/y;->a:Lcom/friday/document/view/share/StudentShareFragment;

    invoke-static {v0, p1, p2}, Lcom/friday/document/view/share/StudentShareFragment;->s(Lcom/friday/document/view/share/StudentShareFragment;Lcom/google/android/material/tabs/TabLayout$Tab;I)V

    return-void
.end method
