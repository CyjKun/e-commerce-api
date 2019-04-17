# E-Commerce-API

## Sign-up
@PostMapping = `https://dev-cj.auth0.com/dbconnections/signup`

headers:

key = `Content-type`

value = `application/json`

body:
```
{
    "client_id": "LwgkpphA88PfIh2vcYvkHK6w4rQR1UR3",
	"email": "<your_email>,
	"password": "<your_password>",
	"connection": "Username-Password-Authentication"
}
```

---

## Login
@PostMapping = `https://dev-cj.auth0.com/oauth/token`

headers:

key = `Content-type`

value = `application/json`

body:
```
{
    "grant_type":"password",
	"username": "<your_email>",
	"password": "<your_password>",
	"audience": "e-commerce-api",
	"client_id": "LwgkpphA88PfIh2vcYvkHK6w4rQR1UR3",
	"client_secret": "7-ismMZEOUvTr08ZZsFSijNYGKyQJiCNl3dCZ9DlrBHaUCnMhtrxV-tgc1p7uHL2"
}
```
note: should be able to return this JSON. where access_token can be used to use in the Authorization bearer token in the API
```
{
    "access_token": "eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsImtpZCI6Ik5ERTJOamhFTjBJMU9VSXlRVFJGT0VJNFFqY3hPVEk1T0VGRVJFSTFOVVUwUWpNNVJUVXpOUSJ9.eyJpc3MiOiJodHRwczovL2Rldi1jai5hdXRoMC5jb20vIiwic3ViIjoiYXV0aDB8NWNhNDFjZDYyZTdlN2QxMGUyNTUwZTQ3IiwiYXVkIjoiZS1jb21tZXJjZS1hcGkiLCJpYXQiOjE1NTQ4NjA1NTQsImV4cCI6MTU1NDk0Njk1NCwiYXpwIjoiTHdna3BwaEE4OFBmSWgydmNZdmtISzZ3NHJRUjFVUjMiLCJndHkiOiJwYXNzd29yZCJ9.FnzQCJKTY-15ZweQjRIY572r9wZNikKLD4_kQHi2wBh6a327jt56tk_buHtrlcdKteoexX0-p2pC8v-NZ_0g3QahDvCCA7fqtc025tBTAkcbKLuTjkKnuqNeRIHpMkD5J8UJLXO6uiSP2UNL_MbFgznqp0rqYRgiRn3aHbVIxTIODlr2JhpCBuupfjjq5ihGXAhi20jgqWiaKS5d4pZSj_ACVbdNiikmYXKmhDaI-VijdcvPezfRwskpxZZGCfYTOFIeY2fe3jhp0_5j4kRohuuEl4kSMrvkWuKWBjytorzdeu1jKNNM5PsyhD8S64xccFSQv3f14BgTpngqW_5Z9w",
    "expires_in": 86400,
    "token_type": "Bearer"
}
```