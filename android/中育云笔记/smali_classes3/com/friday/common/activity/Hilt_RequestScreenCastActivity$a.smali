.class public Lcom/friday/common/activity/Hilt_RequestScreenCastActivity$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/activity/contextaware/OnContextAvailableListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/common/activity/Hilt_RequestScreenCastActivity;->J()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/friday/common/activity/Hilt_RequestScreenCastActivity;


# direct methods
.method public constructor <init>(Lcom/friday/common/activity/Hilt_RequestScreenCastActivity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/common/activity/Hilt_RequestScreenCastActivity$a;->a:Lcom/friday/common/activity/Hilt_RequestScreenCastActivity;

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
    iget-object p1, p0, Lcom/friday/common/activity/Hilt_RequestScreenCastActivity$a;->a:Lcom/friday/common/activity/Hilt_RequestScreenCastActivity;

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/friday/common/activity/Hilt_RequestScreenCastActivity;->inject()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
