.class final Landroidx/compose/ui/text/SaversKt$AnnotatedStringSaver$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/compose/ui/text/SaversKt;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lhd/p;"
    }
.end annotation


# static fields
.field public static final INSTANCE:Landroidx/compose/ui/text/SaversKt$AnnotatedStringSaver$1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/compose/ui/text/SaversKt$AnnotatedStringSaver$1;

    invoke-direct {v0}, Landroidx/compose/ui/text/SaversKt$AnnotatedStringSaver$1;-><init>()V

    sput-object v0, Landroidx/compose/ui/text/SaversKt$AnnotatedStringSaver$1;->INSTANCE:Landroidx/compose/ui/text/SaversKt$AnnotatedStringSaver$1;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Landroidx/compose/runtime/saveable/SaverScope;Landroidx/compose/ui/text/AnnotatedString;)Ljava/lang/Object;
    .locals 2

    .line 2
    invoke-virtual {p2}, Landroidx/compose/ui/text/AnnotatedString;->getText()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroidx/compose/ui/text/SaversKt;->save(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 3
    invoke-virtual {p2}, Landroidx/compose/ui/text/AnnotatedString;->getAnnotations$ui_text_release()Ljava/util/List;

    move-result-object p2

    invoke-static {}, Landroidx/compose/ui/text/SaversKt;->access$getAnnotationRangeListSaver$p()Landroidx/compose/runtime/saveable/Saver;

    move-result-object v1

    invoke-static {p2, v1, p1}, Landroidx/compose/ui/text/SaversKt;->save(Ljava/lang/Object;Landroidx/compose/runtime/saveable/Saver;Landroidx/compose/runtime/saveable/SaverScope;)Ljava/lang/Object;

    move-result-object p1

    filled-new-array {v0, p1}, [Ljava/lang/Object;

    move-result-object p1

    .line 4
    invoke-static {p1}, Lrc/w;->g([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/runtime/saveable/SaverScope;

    check-cast p2, Landroidx/compose/ui/text/AnnotatedString;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/text/SaversKt$AnnotatedStringSaver$1;->invoke(Landroidx/compose/runtime/saveable/SaverScope;Landroidx/compose/ui/text/AnnotatedString;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
