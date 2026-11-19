.class public final synthetic Landroidx/camera/extensions/internal/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/camera/core/impl/Config$OptionMatcher;


# instance fields
.field public final synthetic a:Landroidx/camera/extensions/internal/RequestOptionConfig$Builder;

.field public final synthetic b:Landroidx/camera/core/impl/Config;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/extensions/internal/RequestOptionConfig$Builder;Landroidx/camera/core/impl/Config;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/extensions/internal/c;->a:Landroidx/camera/extensions/internal/RequestOptionConfig$Builder;

    iput-object p2, p0, Landroidx/camera/extensions/internal/c;->b:Landroidx/camera/core/impl/Config;

    return-void
.end method


# virtual methods
.method public final onOptionMatched(Landroidx/camera/core/impl/Config$Option;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/camera/extensions/internal/c;->a:Landroidx/camera/extensions/internal/RequestOptionConfig$Builder;

    iget-object v1, p0, Landroidx/camera/extensions/internal/c;->b:Landroidx/camera/core/impl/Config;

    invoke-static {v0, v1, p1}, Landroidx/camera/extensions/internal/RequestOptionConfig$Builder;->a(Landroidx/camera/extensions/internal/RequestOptionConfig$Builder;Landroidx/camera/core/impl/Config;Landroidx/camera/core/impl/Config$Option;)Z

    move-result p1

    return p1
.end method
