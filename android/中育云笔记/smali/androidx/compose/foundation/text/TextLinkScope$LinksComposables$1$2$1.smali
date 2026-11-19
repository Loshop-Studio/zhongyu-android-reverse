.class final Landroidx/compose/foundation/text/TextLinkScope$LinksComposables$1$2$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lhd/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/text/TextLinkScope;->LinksComposables(Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lhd/a;"
    }
.end annotation


# instance fields
.field final synthetic $range:Landroidx/compose/ui/text/AnnotatedString$Range;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/ui/text/AnnotatedString$Range<",
            "Landroidx/compose/ui/text/LinkAnnotation;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $uriHandler:Landroidx/compose/ui/platform/UriHandler;

.field final synthetic this$0:Landroidx/compose/foundation/text/TextLinkScope;


# direct methods
.method public constructor <init>(Landroidx/compose/foundation/text/TextLinkScope;Landroidx/compose/ui/text/AnnotatedString$Range;Landroidx/compose/ui/platform/UriHandler;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/text/TextLinkScope;",
            "Landroidx/compose/ui/text/AnnotatedString$Range<",
            "Landroidx/compose/ui/text/LinkAnnotation;",
            ">;",
            "Landroidx/compose/ui/platform/UriHandler;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/foundation/text/TextLinkScope$LinksComposables$1$2$1;->this$0:Landroidx/compose/foundation/text/TextLinkScope;

    iput-object p2, p0, Landroidx/compose/foundation/text/TextLinkScope$LinksComposables$1$2$1;->$range:Landroidx/compose/ui/text/AnnotatedString$Range;

    iput-object p3, p0, Landroidx/compose/foundation/text/TextLinkScope$LinksComposables$1$2$1;->$uriHandler:Landroidx/compose/ui/platform/UriHandler;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/compose/foundation/text/TextLinkScope$LinksComposables$1$2$1;->invoke()V

    sget-object v0, Lqc/q;->a:Lqc/q;

    return-object v0
.end method

.method public final invoke()V
    .locals 3

    .line 2
    iget-object v0, p0, Landroidx/compose/foundation/text/TextLinkScope$LinksComposables$1$2$1;->this$0:Landroidx/compose/foundation/text/TextLinkScope;

    iget-object v1, p0, Landroidx/compose/foundation/text/TextLinkScope$LinksComposables$1$2$1;->$range:Landroidx/compose/ui/text/AnnotatedString$Range;

    invoke-virtual {v1}, Landroidx/compose/ui/text/AnnotatedString$Range;->getItem()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/compose/ui/text/LinkAnnotation;

    iget-object v2, p0, Landroidx/compose/foundation/text/TextLinkScope$LinksComposables$1$2$1;->$uriHandler:Landroidx/compose/ui/platform/UriHandler;

    invoke-static {v0, v1, v2}, Landroidx/compose/foundation/text/TextLinkScope;->access$handleLink(Landroidx/compose/foundation/text/TextLinkScope;Landroidx/compose/ui/text/LinkAnnotation;Landroidx/compose/ui/platform/UriHandler;)V

    return-void
.end method
