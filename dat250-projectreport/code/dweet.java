@PostMapping("/pollAdd")
public String pollAdd(@RequestParam String name, @RequestParam String description, @RequestParam String isPublic,
			@RequestParam String status, Model model, OAuth2AuthenticationToken authentication) {

String thingName = "unique_poll_dweet";
JsonObject json = new JsonObject();
json.addProperty("Poll name: " + name, "Poll description: " + description);
DweetIO.publish(thingName, json);

}
