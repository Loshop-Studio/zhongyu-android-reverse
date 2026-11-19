.class public Lt/g$a;
.super Lz/f$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lt/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private a:Ls/f$c;


# direct methods
.method public constructor <init>(Ls/f$c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lz/f$c;-><init>()V

    .line 2
    iput-object p1, p0, Lt/g$a;->a:Ls/f$c;

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lt/g$a;->a:Ls/f$c;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Ls/f$c;->onFontRetrievalFailed(I)V

    :cond_0
    return-void
.end method

.method public b(Landroid/graphics/Typeface;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lt/g$a;->a:Ls/f$c;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Ls/f$c;->onFontRetrieved(Landroid/graphics/Typeface;)V

    :cond_0
    return-void
.end method
