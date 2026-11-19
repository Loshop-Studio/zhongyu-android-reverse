.class public abstract Lcom/zykj/subscriber/dao/PDFPreviewDatabase;
.super Landroidx/room/h0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/subscriber/dao/PDFPreviewDatabase$a;
    }
.end annotation


# static fields
.field public static final n:Lcom/zykj/subscriber/dao/PDFPreviewDatabase$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static volatile o:Lcom/zykj/subscriber/dao/PDFPreviewDatabase;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/zykj/subscriber/dao/PDFPreviewDatabase$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/zykj/subscriber/dao/PDFPreviewDatabase$a;-><init>(Lkotlin/jvm/internal/g;)V

    sput-object v0, Lcom/zykj/subscriber/dao/PDFPreviewDatabase;->n:Lcom/zykj/subscriber/dao/PDFPreviewDatabase$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroidx/room/h0;-><init>()V

    return-void
.end method

.method public static final synthetic C()Lcom/zykj/subscriber/dao/PDFPreviewDatabase;
    .locals 1

    sget-object v0, Lcom/zykj/subscriber/dao/PDFPreviewDatabase;->o:Lcom/zykj/subscriber/dao/PDFPreviewDatabase;

    return-object v0
.end method

.method public static final synthetic D(Lcom/zykj/subscriber/dao/PDFPreviewDatabase;)V
    .locals 0

    sput-object p0, Lcom/zykj/subscriber/dao/PDFPreviewDatabase;->o:Lcom/zykj/subscriber/dao/PDFPreviewDatabase;

    return-void
.end method


# virtual methods
.method public abstract E()Le2/b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method
