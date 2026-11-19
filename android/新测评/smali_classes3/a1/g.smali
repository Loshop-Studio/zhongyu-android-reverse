.class public La1/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La1/e;


# static fields
.field public static final a:La1/g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, La1/g;

    .line 2
    .line 3
    invoke-direct {v0}, La1/g;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La1/g;->a:La1/g;

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

.method public static b()La1/e;
    .locals 1

    .line 1
    sget-object v0, La1/g;->a:La1/g;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method public a(Lo0/j;Lm0/d;)Lo0/j;
    .locals 0

    .line 1
    return-object p1
.end method
