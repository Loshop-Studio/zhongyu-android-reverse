.class public Lcom/friday/main/view/Hilt_DBActivity$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/activity/contextaware/OnContextAvailableListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/main/view/Hilt_DBActivity;->J()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/friday/main/view/Hilt_DBActivity;


# direct methods
.method public constructor <init>(Lcom/friday/main/view/Hilt_DBActivity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/main/view/Hilt_DBActivity$a;->a:Lcom/friday/main/view/Hilt_DBActivity;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onContextAvailable(Landroid/content/Context;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/friday/main/view/Hilt_DBActivity$a;->a:Lcom/friday/main/view/Hilt_DBActivity;

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/friday/main/view/Hilt_DBActivity;->inject()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
