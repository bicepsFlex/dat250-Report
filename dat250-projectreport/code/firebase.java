        CollectionReference pollCR = fb.getFirebase().collection("Polls");
        pollCR.document(String.valueOf((newPoll.getPollID()))).set(fbPoll);
        DocumentReference dr = fb.getFirebase().collection("Polls").document(String.valueOf(newPoll.getPollID()));
        dr.update("pollID",newPoll.getPollID());