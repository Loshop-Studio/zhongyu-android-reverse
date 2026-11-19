.class public final Lz6/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz6/h;
.implements Lz6/c;


# static fields
.field public static final a:Lz6/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lz6/d;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lz6/d;->a:Lz6/d;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final bridge synthetic a(I)Lz6/h;
    .locals 0

    .line 1
    sget-object p1, Lz6/d;->a:Lz6/d;

    .line 2
    .line 3
    return-object p1
.end method

.method public final bridge synthetic b(I)Lz6/h;
    .locals 0

    .line 1
    sget-object p1, Lz6/d;->a:Lz6/d;

    .line 2
    .line 3
    return-object p1
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 1

    .line 1
    sget-object v0, Lkotlin/collections/z;->a:Lkotlin/collections/z;

    .line 2
    .line 3
    return-object v0
.end method
