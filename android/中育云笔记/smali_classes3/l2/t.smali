.class public final synthetic Ll2/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic c:Lcom/friday/common/widget/dialog/WPSDownloadDialog;


# direct methods
.method public synthetic constructor <init>(Lcom/friday/common/widget/dialog/WPSDownloadDialog;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll2/t;->c:Lcom/friday/common/widget/dialog/WPSDownloadDialog;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ll2/t;->c:Lcom/friday/common/widget/dialog/WPSDownloadDialog;

    invoke-static {v0, p1}, Lcom/friday/common/widget/dialog/WPSDownloadDialog;->p(Lcom/friday/common/widget/dialog/WPSDownloadDialog;Landroid/view/View;)V

    return-void
.end method
