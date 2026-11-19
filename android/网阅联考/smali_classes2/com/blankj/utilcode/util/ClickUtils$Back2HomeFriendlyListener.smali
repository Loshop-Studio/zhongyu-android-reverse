.class public interface abstract Lcom/blankj/utilcode/util/ClickUtils$Back2HomeFriendlyListener;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/blankj/utilcode/util/ClickUtils;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "Back2HomeFriendlyListener"
.end annotation


# static fields
.field public static final DEFAULT:Lcom/blankj/utilcode/util/ClickUtils$Back2HomeFriendlyListener;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/blankj/utilcode/util/ClickUtils$Back2HomeFriendlyListener$1;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/blankj/utilcode/util/ClickUtils$Back2HomeFriendlyListener$1;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/blankj/utilcode/util/ClickUtils$Back2HomeFriendlyListener;->DEFAULT:Lcom/blankj/utilcode/util/ClickUtils$Back2HomeFriendlyListener;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public abstract dismiss()V
.end method

.method public abstract show(Ljava/lang/CharSequence;J)V
.end method
