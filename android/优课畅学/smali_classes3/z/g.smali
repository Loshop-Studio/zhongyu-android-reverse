.class public Lz/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz/e;


# static fields
.field public static final a:Lz/g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lz/g;

    .line 2
    .line 3
    invoke-direct {v0}, Lz/g;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lz/g;->a:Lz/g;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static b()Lz/e;
    .locals 1

    .line 1
    sget-object v0, Lz/g;->a:Lz/g;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method public a(Ln/j;Ll/d;)Ln/j;
    .locals 0

    .line 1
    return-object p1
.end method
