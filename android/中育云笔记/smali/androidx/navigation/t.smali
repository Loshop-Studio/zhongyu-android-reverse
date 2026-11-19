.class public final synthetic Landroidx/navigation/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/a;


# instance fields
.field public final synthetic c:Landroidx/navigation/NavDeepLink;


# direct methods
.method public synthetic constructor <init>(Landroidx/navigation/NavDeepLink;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/navigation/t;->c:Landroidx/navigation/NavDeepLink;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/navigation/t;->c:Landroidx/navigation/NavDeepLink;

    invoke-static {v0}, Landroidx/navigation/NavDeepLink;->e(Landroidx/navigation/NavDeepLink;)Lkotlin/text/Regex;

    move-result-object v0

    return-object v0
.end method
