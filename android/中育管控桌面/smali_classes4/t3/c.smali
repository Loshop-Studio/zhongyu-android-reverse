.class public final synthetic Lt3/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/zykj/huiwei/launcher/dao/PreviewDao_Impl;

.field public final synthetic b:Lcom/zykj/huiwei/launcher/dao/PDFPreviewInfo;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/huiwei/launcher/dao/PreviewDao_Impl;Lcom/zykj/huiwei/launcher/dao/PDFPreviewInfo;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt3/c;->a:Lcom/zykj/huiwei/launcher/dao/PreviewDao_Impl;

    iput-object p2, p0, Lt3/c;->b:Lcom/zykj/huiwei/launcher/dao/PDFPreviewInfo;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lt3/c;->a:Lcom/zykj/huiwei/launcher/dao/PreviewDao_Impl;

    iget-object v1, p0, Lt3/c;->b:Lcom/zykj/huiwei/launcher/dao/PDFPreviewInfo;

    check-cast p1, Landroidx/sqlite/SQLiteConnection;

    invoke-static {v0, v1, p1}, Lcom/zykj/huiwei/launcher/dao/PreviewDao_Impl;->d(Lcom/zykj/huiwei/launcher/dao/PreviewDao_Impl;Lcom/zykj/huiwei/launcher/dao/PDFPreviewInfo;Landroidx/sqlite/SQLiteConnection;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
